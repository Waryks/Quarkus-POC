package org.quarkusapplication.login;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LoginApplicationTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/login?username=user1&password=password1")
          .then()
             .statusCode(200);
    }

}