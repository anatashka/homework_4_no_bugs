package junior.iteration2;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class TransferMoneyTest_v1 {
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static String userAuthHeader;

    @BeforeAll
    public static void setupRestAssured() {
            /*RestAssured.filters(
                    List.of(new RequestLoggingFilter(),
                            new ResponseLoggingFilter()
                    )
            );*/
    }

    // create user for deposit test
    @Test
    public void userTransferBetweenHisAccountsTest() {
        //create user for deposit test
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                .body("""
                        {
                            "username": "transfer_user",
                            "password": "P@ssw0rd",
                            "role": "USER"
                        }
                        """)
                .post("http://localhost:4111/api/v1/admin/users")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED);

        userAuthHeader = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "username": "transfer_user",
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
        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("http://localhost:4111/api/v1/customer/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);

        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .post("http://localhost:4111/api/v1/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED);

        //check that account2 is really created
        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("http://localhost:4111/api/v1/customer/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);

        // deposit 1 = 1000
        Response deposit1 = given()
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

        String deposit1_balance = deposit1.path("balance").toString();
        System.out.println(ANSI_PURPLE + "Successful deposit #1:  " + deposit1_balance + ANSI_RESET);
        // check user accounts balance on all accounts after deposit 1
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
        System.out.println(ANSI_PURPLE + "User accounts balance on all accounts after deposit 1  " + balance_check1 + ANSI_RESET);

        System.out.println(ANSI_PURPLE + "ACTION: transfer $500 from ACC1 to ACC2" + ANSI_RESET);
        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "senderAccountId": 1,
                            "receiverAccountId": 2,
                            "amount": 250.75
                        }
                        """)
                .post("http://localhost:4111/api/v1/accounts/transfer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
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
        System.out.println(ANSI_PURPLE + "Now balance on all user accounts is  " + balance_check2 + ANSI_RESET);

        System.out.println(ANSI_PURPLE + "ACTION: transfer $50 from ACC2 to ACC1" + ANSI_RESET);
        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "senderAccountId": 2,
                            "receiverAccountId": 1,
                            "amount": 50
                        }
                        """)
                .post("http://localhost:4111/api/v1/accounts/transfer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
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
        System.out.println(ANSI_PURPLE + "Now balance on all user accounts is  " + balance_check3 + ANSI_RESET);
        Response aboveBalance = given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "senderAccountId": 1,
                            "receiverAccountId": 2,
                            "amount": 25000
                        }
                        """)
                .post("http://localhost:4111/api/v1/accounts/transfer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .extract()
                .response();
        System.out.println("$25000 (above balance) are not sent");

        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "senderAccountId": 1,
                            "receiverAccountId": 2,
                            "amount": -250
                        }
                        """)
                .post("http://localhost:4111/api/v1/accounts/transfer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST);
        System.out.println("$-250 are not sent");
    }
    @Test
    public void userTransferToOtherAccountTest() {
        //create user for deposit test
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                .body("""
                        {
                            "username": "transfer_user2",
                            "password": "P@ssw0rd",
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
                            "username": "transfer_user2",
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
                .header("Authorization", userAuthHeader2)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .post("http://localhost:4111/api/v1/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED);

        //check that account is really created
        Response account2 = given()
                .header("Authorization", userAuthHeader2)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("http://localhost:4111/api/v1/customer/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        String balance2 = account2.path("balance").toString();
        String acc2 = account2.path("accountNumber").toString();
        String account_id2 = account2.path("id").toString();
        //int id = Integer.parseInt(account_id);

        // check current account balance
        System.out.println(ANSI_PURPLE + "User #2 has following account: " + acc2 + " with id = " + account_id2 + " and balance: " + balance2 + ANSI_RESET);

        given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("""
                        {
                            "senderAccountId": 1,
                            "receiverAccountId": 3,
                            "amount": 150
                        }
                        """)
                .post("http://localhost:4111/api/v1/accounts/transfer")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);

        Response user1 = given()
                .header("Authorization", userAuthHeader)
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("http://localhost:4111/api/v1/customer/accounts")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        String balance1 = user1.path("balance").toString();
        String acc1 = user1.path("accountNumber").toString();
        String account_id1 = user1.path("id").toString();
        //int id = Integer.parseInt(account_id);

        // check current account balance
        System.out.println(ANSI_PURPLE + "User #1 has following balance on accounts: " + acc1 + " with id = " + account_id1 + " and balance: " + balance1 + ANSI_RESET);



    }
}
