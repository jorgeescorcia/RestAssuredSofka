package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.apache.log4j.Logger;
import setup.SingleSetup;

import java.net.URI;


import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class SingleUserSteps extends SingleSetup {
    public static final Logger LOGER = Logger.getLogger(SingleUserSteps.class);
    private Response response;
    private RequestSpecification resquest;



    @Given("me encuentro en la pagina")
    public void me_encuentro_en_la_pagina() {
        generalSetUp();

    }
    @When("realizo la peticion de consulta")
    public void realizo_la_peticion_de_consulta() {

        response = when().get(LOGIN_RESOURCE);


    }
    @Then("el sistema deberia de mostrarme el usuario")
    public void el_sistema_deberia_de_mostrarme_el_usuario() {
        response.then()
                .statusCode(HttpStatus.SC_OK)
                .body("data.id", equalTo(2));


    }

}
