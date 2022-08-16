#language
  Feature: Clickear en diferentes productos
    Background:
      Given estoy en la pagina de juanregala https://juanregala.com.co/

      Scenario: Buscar regalos para profesor
        When quiero escoger un regalo para mi profesor
        Then selecciono una lista de productos para elegir cualquiera