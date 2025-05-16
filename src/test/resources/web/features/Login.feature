@Login
Feature: Login

  Background:
    Given Se ingresa a la web de practica
    And Se clickea en MyAccount en la barra de navegacion superior

  @LoginExitoso @Smoke @Do
  Scenario: Ingresar con credenciales validas.
    And En el campo Username se ingresa el valor 'pedro.pez@gmail.com' y en el campo Password el valor 'P3drQPez1'
    When Se hace click en el boton Login
    Then Redirige al usuario al Dashboard