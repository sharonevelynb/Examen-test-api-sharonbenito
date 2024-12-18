package com.nttdata.glue;

import com.nttdata.step.CrearOrderStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CrearOrderStepDef {

    @Steps
    private CrearOrderStep order;

    @When("creo una orden de compra de pet con id {int}, petId {int}, quantity {int}, shipdate {string}, status {string}, complete {string}")
    public void creoUnaOrdenDeCompraDePetConIdPetIdQuantityShipdateStatusComplete(int order_id, int order_petId, int order_quantity, String order_shipDate, String order_status , String order_complete) {
        order.creoUnaOrdenDeCompraDePetConIdPetIdQuantityShipdateStatusComplete(order_id, order_petId, order_quantity, order_shipDate, order_status, order_complete);
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));

    }

}
