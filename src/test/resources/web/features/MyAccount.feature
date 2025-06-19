@MyAccount
Feature: MyAccount

  Background:
    Given Se ingresa a la web de practica
    And Se clickea en MyAccount en la barra de navegacion superior

  @AccountDetails @Smoke
  Scenario: Validar seccion Account Details
    And En el campo Username se ingresa el valor 'pedro.pez@gmail.com' y en el campo Password el valor 'P3drQPez1'
    And Se hace click en el boton Login
    And Redirige al usuario al Dashboard
    When Se clickea en Account Details
    Then Se pueden visualizar los detalles de la cuenta y la posibilidad de cambiar contraseña

  @AccountLogOff @Smoke
  Scenario: Cerrar sesion
    And En el campo Username se ingresa el valor 'pedro.pez@gmail.com' y en el campo Password el valor 'P3drQPez1'
    And Se hace click en el boton Login
    And Redirige al usuario al Dashboard
    When Se clickea en Logout
    And Se redirige al usuario a la pantalla de login o registro