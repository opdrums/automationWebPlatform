@web
Feature: How automation wants to user login
  Background:
    Given open to web CO
    When the user clicks on the alert delivery button

  @login
  Scenario Outline: hacer login como usuario
    Given ingresas <email> y <password>
    When seleccionar el elemento del menu <main>
    Examples:
      |email|password|main|
      |himalaya@gmail.com|123456|Ayuda|
