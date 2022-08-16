#language en
Feature: tercer flujo busqueda por excel

  Scenario Outline: <Casos>
    Given estoy en la pagina de juanregala <Url>
    When quiero encontrar regalos
    Then verifico el regalo
    Examples:
      | Casos    | Url                        |
      | busqueda | https://juanregala.com.co/ |
