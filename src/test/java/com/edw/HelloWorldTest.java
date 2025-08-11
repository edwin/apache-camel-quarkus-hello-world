package com.edw;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.MediaType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * <pre>
 *  com.edw.HelloWorldTest
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 11 Aug 2025 10:57
 */
@QuarkusTest
public class HelloWorldTest {

    @Test
    public void test_helloWorld() {
        given()
                .log()
                .all()
                .accept(MediaType.APPLICATION_JSON.toString())
            .when()
                .get("/")
            .then()
                .log()
                .all()
                .assertThat()
                    .contentType(MediaType.APPLICATION_JSON.toString())
                    .statusCode(200)
                    .body("hello", is("world"));
    }

}
