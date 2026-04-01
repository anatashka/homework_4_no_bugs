package junior.iteration1;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static io.restassured.RestAssured.given;

public class CreateUserTest {
        @BeforeAll
        public static  void setupRestAssured(){
            RestAssured.filters(
                    List.of(new RequestLoggingFilter(),
                            new ResponseLoggingFilter()
                    )
            );
        }

    @Test
    public void userCanBeCreatedTest() {
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                .body("""
                        {
                            "username": "kate5",
                            "password": "Kate2026!",
                            "role": "USER"
                        }
                        """)
                .post("http://localhost:4111/api/v1/admin/users")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .body("username", Matchers.equalTo("kate5"))
                .body("password", Matchers.not(Matchers.equalTo("Kate2026!")))
                .body("role", Matchers.equalTo("USER"));
    }

    public static Stream<Arguments> userInvalidData(){
            return Stream.of(
                    // username field validation
                    Arguments.of("", "Pass0rd!", "USER", "username", "Username cannot be blank"),
                    Arguments.of("ab", "Pass0rd!", "USER", "username", "Username must be between 3 and 15 characters"),
                    Arguments.of("ab@", "Pass0rd!", "USER", "username", "Username must contain only letters, digits, dashes, underscores, and dots")
                    //Arguments.of("", "Pass0rd!", "USER", "username", "")
            );
    }
    @MethodSource("userInvalidData")
    @ParameterizedTest
    public void adminCanNotCreateUserWithInvalidDataTest(String username, String password, String role, String errorKey, String errorValue) {
            String requestBody = String.format(
                    """
                        {    
                            "username": "%s",
                            "password": "%s",
                            "role": "%s"
                        }
                    """, username, password, role);

            given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", "Basic YWRtaW46YWRtaW4=")
                .body(requestBody)
                .post("http://localhost:4111/api/v1/admin/users")
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body(errorKey, Matchers.hasItem(errorValue));
    }

    }
