package com.nttdata.step;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class ConsultarOrderStep {

    private String URLBASE;


    public void setURL(String url) {
        this.URLBASE = url;
    }


    public void consultoStoreOrderSegunId(int orderId) {
        SerenityRest.given()
                .baseUri(URLBASE)
                .contentType("application/json")
                .when()
                .log().all()
                .get("/" + orderId)
                .then()
                .log().all()
        ;
    }

    public void validoElCodigoDeRespuestaDeConsultaSea(int statusCode) {
        Assert.assertEquals(statusCode,lastResponse().getStatusCode());
    }

    public void validoElParametroTengaElContenido(String parametro, int valor) {
        String resultadoReal = lastResponse().body().path(parametro).toString();
        //convertimos en int al resultadoReal
        int resultado_real = Integer.parseInt(resultadoReal);
        Assert.assertEquals(valor, resultado_real);

    }
    public void validoElParametroTengaElContenido(String parametro, String valor) {
        String resultadoReal = lastResponse().body().path(parametro).toString();
        Assert.assertEquals(valor, resultadoReal);

    }
}
