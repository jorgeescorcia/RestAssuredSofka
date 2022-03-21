package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import setup.CreateUserSetup;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateUserSteps  extends CreateUserSetup {
    private Response response;
    private RequestSpecification request;
    @Given("me encuentro en la pagina de regres en ingreso el nombre {string} y el trabajo {string}")
    public void me_encuentro_en_la_pagina_de_regres_en_ingreso_el_nombre_y_el_trabajo(String name, String jobs) {
        generalSetUp();
        request = given()
                .contentType(ContentType.JSON)
                .body(body(name, jobs));
    }

    @When("realizo la peticion de creacion de usuario")
    public void realizo_la_peticion_de_creacion_de_usuario() {
        response = request.when().post(CREATE_RESOURCE);

    }
    @Then("el sistema debera mostrarme el nombre morpheus")
    public void el_sistema_debera_mostrarme_el_nombre_morpheus() {
        response.then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", equalTo("morpheus"));

    }
    private String body(String name, String jobs){
        return "{\n" +
                "    \"name\": \"" + name + "\",\n" +
                "    \"jobs\": \"" + jobs + "\"\n" +
                "}";
    }


}
