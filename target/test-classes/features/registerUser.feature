@web
Feature: How automation wants to register user
  Background:
    Given open to web CO
    When the user clicks on the alert delivery button

  @register
  Scenario Outline: Register user
    Given Click button <register> selected type <person>
    When send information form register <name> <email> <phone> <password>
    And selected country <country>
    Then success the <register>
    Examples:
      |register| name| email| phone| password| person| country|
      |Regístrate| usuario| example@gmail.com| 3157893377| 123456| Persona natural| Mexico|
