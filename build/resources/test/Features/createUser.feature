# new feature
# Tags: optional

Feature: Creacion de usuario

  Scenario: Creacion exitosa de usuario
    Given me encuentro en la pagina de regres en ingreso el nombre "morpheus" y el trabajo "leader"
    When realizo la peticion de creacion de usuario
    Then el sistema debera mostrarme el nombre morpheus

