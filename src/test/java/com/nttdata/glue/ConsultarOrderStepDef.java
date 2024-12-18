package com.nttdata.glue;

import com.nttdata.step.ConsultarOrderStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ConsultarOrderStepDef {

    @Steps
    private ConsultarOrderStep consultarOrderStep;

    @Given("la url de PetStore es {string}")
    public void laUrlDePetStoreEs(String url) {
        consultarOrderStep.setURL(url);
    }

    @When("consulto store order segun id {int}")
    public void consultoStoreOrderSegunId(int orderId) {
        consultarOrderStep.consultoStoreOrderSegunId(orderId);

    }


    @Then("valido el codigo de respuesta de consulta sea {int}")
    public void validoElCodigoDeRespuestaDeConsultaSea(int status_Code) {
        consultarOrderStep.validoElCodigoDeRespuestaDeConsultaSea(status_Code);

    }

    @And("valido el parametro {string} tenga el contenido {int}")
    public void validoElParametroTengaElContenido(String parametro, int valor) {
        consultarOrderStep.validoElParametroTengaElContenido(parametro,valor);

    }

    @And("valido el parametro {string} tenga el contenido {string}")
    public void validoElParametroTengaElContenido(String parametro, String valor) {
        consultarOrderStep.validoElParametroTengaElContenido(parametro,valor);

    }
}
