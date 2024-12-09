package ru.alexander.javaspringtests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationsTests {

    @Test
    public void shouldReturnHelloMessageWhenSendingGetRequest() {
        String expectedResult = "Hello, someone";

        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/hello")
                .andReturn();

        String receivedResult = response.jsonPath().getString("answer");
        assertThat(receivedResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturnHi() {
        String response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .queryParam("message", "Hello")
                .when()
                .get("http://localhost:8080/api/hi")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        assertThat(response).isEqualTo("Hi!");
    }

    @Test
    public void shouldReturnBye() {
        String response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .queryParam("message", "aboba")
                .when()
                .get("http://localhost:8080/api/hi")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        assertThat(response).isEqualTo("Bye");
    }



}
