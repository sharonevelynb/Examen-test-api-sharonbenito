package com.nttdata.step;

import net.serenitybdd.rest.SerenityRest;

public class CrearOrderStep {

    private static String URLBASE = "https://petstore.swagger.io/v2/store/order";

    public void creoUnaOrdenDeCompraDePetConIdPetIdQuantityShipdateStatusComplete(int orderId, int orderPetId, int orderQuantity, String orderShipDate, String orderStatus, String orderComplete) {
        SerenityRest.given()
                .contentType("application/json")
                .body("{\n" +
                        "  \"id\": \""+orderId+"\",\n" +
                        "  \"petId\": \""+orderPetId+"\",\n" +
                        "  \"quantity\": \""+orderQuantity+"\",\n" +
                        "  \"shipDate\":  \""+orderShipDate+"\",\n" +
                        "  \"status\": \""+orderStatus+"\",\n" +
                        "  \"complete\": \""+orderComplete+"\"\n" +
                        "}")
                .log().all()
                .post(URLBASE)
                .then()
        ;

    }
}
