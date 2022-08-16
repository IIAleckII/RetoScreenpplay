#language en
Feature: Primer flujo tres busquedas por background

  Background:
    Given estoy en la pagina de juanregala https://juanregala.com.co/

  Scenario: Buscar regalos
    When quiero buscar un regalo
      | obsequio           |
      | regalos para mujer |
    Then valido el regalo

  Scenario: Buscar regalos
    When quiero buscar un regalo
      | obsequio             |
      | regalos para hombres |
    Then valido el regalo