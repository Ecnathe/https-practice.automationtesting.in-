@Login
Feature: Login

  Background:
    Given Se ingresa a la web de practica
    And Se clickea en MyAccount en la barra de navegacion superior

  @LoginExitoso @Smoke
  Scenario: Ingresar con credenciales validas.
    And En el campo Username se ingresa el valor 'pedro.pez@gmail.com' y en el campo Password el valor 'P3drQPez1'
    When Se hace click en el boton Login
    Then Redirige al usuario al Dashboard

  @LoginFallido @Smoke @Do
  Scenario Outline: Login con credenciales invalidas por <credenciales>
    And En el campo Username se ingresa el valor '<user>' y en el campo Password el valor '<pass>'
    When Se hace click en el boton Login
    Then Se debe mostrar el mensaje de error correspondiente.

    Examples:
      | user                | pass      | credenciales               |
      | pedro.pqz@gmail.com | P6drQPez1 | Mail y Pass incorrectas    |
      | pedro.paz@gmail.com |           | Mail correcto y Pass vacio |
      |                     | P3drQPez1 | Mail vacio y Pass correcta |
      |                     |           | Mail y Pass vacio          |
      | Pedro.pez@gmail.com | p3drQPez1 | Case sensitive             |