#language en
Feature: segundo flujo busqueda de regalos

  Scenario Outline: <Caso><Regalo>
    Given estoy en la pagina de juanregala <Url>
    When quiero buscar regalos<Regalo>
    Then valido que el regalo<Regalo>
    Examples:
      | Caso               | Regalo         | Url                        |
      | busqueda de regalo | Flores         | https://juanregala.com.co/ |
      | busqueda de regalo | Ancheta        | https://juanregala.com.co/ |
      | busqueda de regalo | Desayuno       | https://juanregala.com.co/ |
      | busqueda de regalo | Mamá           | https://juanregala.com.co/ |
      | busqueda de regalo | Cena romantica | https://juanregala.com.co/ |



