package com.ksmpartners.quarkus.domino.client.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class QuarkusDominoClientResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/quarkus-domino-client")
                .then()
                .statusCode(200)
                .body(is("Hello quarkus-domino-client"));
    }
}
