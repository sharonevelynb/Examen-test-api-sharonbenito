# new feature
# Tags: optional

Feature: PetStore Order

  @Crear_Order
  Scenario Outline: Crear store order
    Given la url de PetStore es 'https://petstore.swagger.io/v2/store/order'
    When creo una orden de compra de pet con id <order_id>, petId <order_petId>, quantity <order_quantity>, shipdate "<order_shipDate>", status "<order_status>", complete "<order_complete>"
    Then valido el codigo de respuesta sea <statusCode>
    Examples:
      | order_id | order_petId | order_quantity | order_shipDate               | order_status | order_complete | statusCode |
      | 1001     | 1020        | 1              | 2024-12-16T21:30:17.211+0000 | placed       | true           | 200        |
      | 1002     | 1021        | 1              | 2024-12-17T21:30:17.211+0000 | placed       | true           | 200        |


  @Consultar_Order
  Scenario Outline: Consultar store order
    Given la url de PetStore es "https://petstore.swagger.io/v2/store/order"
    When consulto store order segun id <orderId>
    Then valido el codigo de respuesta de consulta sea <status_code>
    And valido el parametro "petId" tenga el contenido <orderPetId>
    And valido el parametro "quantity" tenga el contenido <orderQuantity>
    And valido el parametro "shipDate" tenga el contenido "<orderShipDate>"
    And valido el parametro "status" tenga el contenido "<orderStatus>"
    And valido el parametro "complete" tenga el contenido "<orderComplete>"
    Examples:
      | orderId | status_code | orderPetId | orderQuantity | orderShipDate                | orderStatus | orderComplete |
      | 1001    | 200         | 1020       | 1             | 2024-12-16T21:30:17.211+0000 | placed      | true          |
      | 1002    | 200         | 1021       | 1             | 2024-12-17T21:30:17.211+0000 | placed      | true          |





