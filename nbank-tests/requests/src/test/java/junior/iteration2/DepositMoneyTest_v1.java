package junior.iteration2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DepositMoneyTest_v1 {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

        @BeforeAll
        public static  void setupRestAssured(){
            /*RestAssured.filters(
                    List.of(new RequestLoggingFilter(),
                            new ResponseLoggingFilter()
                    )
            );*/
        }

        // create user for deposit test
        @Test
        public void userCanDepositIntoAccountTest() {
            //create user for deposit test
            given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                    .body("""
                        {
                            "username": "deposit_user",
                            "password": "P@ssw0rd",
                            "role": "USER"
                        }
                        """)
                    .post("http://localhost:4111/api/v1/admin/users")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_CREATED);

            String userAuthHeader = given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "username": "deposit_user",
                            "password": "P@ssw0rd",
                            "role": "USER"
                        }
                        """)
                    .post("http://localhost:4111/api/v1/auth/login")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .header("Authorization");

            //create account
            given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .post("http://localhost:4111/api/v1/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_CREATED);

            //check that account is really created
            Response account = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();

            String balance = account.path("balance").toString();
            String acc = account.path("accountNumber").toString();
            String account_id = account.path("id").toString();
            //int id = Integer.parseInt(account_id);

            // check current account balance
            System.out.println(ANSI_PURPLE + "Current user has following account: " + acc + " with id = " + account_id + " and balance: " + balance + ANSI_RESET);

            // deposit 1 = 100
            Response deposit1 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 1,
                            "balance": 100
                        }
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();

            String deposit1_balance = deposit1.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Successful deposit #1:  " + 100 + ANSI_RESET);
            // check account balance after deposit 1
            Response account_check = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check1 = account_check.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Now balance is  " + balance_check1 + ANSI_RESET);

            // deposit 2 = 500.55
            Response deposit2 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 1,
                            "balance": 500.55
                        }
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();

            String deposit2_balance = deposit2.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Successful deposit #2:  " + 500.55 + ANSI_RESET);
            // check account balance after deposit 2
            Response account_check2 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check2 = account_check2.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Now balance is  " + balance_check2 + ANSI_RESET);

            // deposit 3 = 5000 -> OK
            Response deposit3 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 1,
                            "balance": 5000
                        }
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();

            String deposit3_balance = deposit3.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Successful deposit #3 (MAX = 5000):  " + 5000 + ANSI_RESET);
            // check account balance after deposit 3
            Response account_check3 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check3 = account_check3.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Now balance is  " + balance_check3 + ANSI_RESET);

            // deposit 4 = 5000.55 -> ERROR 400
            //Response deposit4 =
                    given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 1,
                            "balance": 5000.55
                        }
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_BAD_REQUEST);
                    /*.extract()
                    .response();

            String deposit4_balance = deposit4.path("balance").toString();*/
            System.out.println(ANSI_PURPLE + "Unsuccessful deposit #4 (more than MAX = 5000):  " + 5000.55 + ANSI_RESET);
            // check account balance after deposit 4
            Response account_check4 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check4 = account_check4.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Current balance is  " + balance_check4 + ANSI_RESET);

            // deposit 5 = -50 -> ERROR 400
            //Response deposit5 =
                    given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 1,
                            "balance": -50
                        }
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_BAD_REQUEST);
                    //.extract()
                   // .response();

            //String deposit5_balance = deposit5.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Unsuccessful deposit #5 (<0):  -50" + ANSI_RESET);
            // check account balance after deposit 5
            Response account_check5 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check5 = account_check5.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Current balance is  " + balance_check5 + ANSI_RESET);


            // deposit 6 to not existing account ERROR 400
            given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 20,
                            "balance": 50
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_BAD_REQUEST);

            System.out.println(ANSI_PURPLE + "Unsuccessful deposit #6 (to not existing account):  50" + ANSI_RESET);
            // check account balance after deposit 6
            Response account_check6 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check6 = account_check6.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Current balance is  " + balance_check6 + ANSI_RESET);

            // deposit 7 to not your account ERROR 400
            given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                    .body("""
                        {
                            "username": "kat",
                            "password": "Kate2026!",
                            "role": "USER"
                        }
                        """)
                    .post("http://localhost:4111/api/v1/admin/users")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_CREATED);

            String userAuthHeader2 = given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "username": "kat",
                            "password": "Kate2026!",
                            "role": "USER"
                        }
                        """)
                    .post("http://localhost:4111/api/v1/auth/login")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .header("Authorization");

            //create account
            given()
                    .header("Authorization", userAuthHeader2)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .post("http://localhost:4111/api/v1/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_CREATED);

            //check that account is really created
            Response kate_account = given()
                    .header("Authorization", userAuthHeader2)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract().response();
            //System.out.println(kate_account.asPrettyString());
            given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body("""
                        {
                            "id": 2,
                            "balance": 50
                        """)
                    .post("http://localhost:4111/api/v1/accounts/deposit")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_BAD_REQUEST);
            System.out.println(ANSI_PURPLE + "Unsuccessful deposit #7 (to not YOUR account):  50" + ANSI_RESET);
            // check account balance after deposit 7
            Response account_check7 = given()
                    .header("Authorization", userAuthHeader)
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .get("http://localhost:4111/api/v1/customer/accounts")
                    .then()
                    .assertThat()
                    .statusCode(HttpStatus.SC_OK)
                    .extract()
                    .response();
            String balance_check7 = account_check7.path("balance").toString();
            System.out.println(ANSI_PURPLE + "Current balance is  " + balance_check7 + ANSI_RESET);

        }

    }


