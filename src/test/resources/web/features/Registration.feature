@Registration
Feature: Registration

  Background:
    Given Se ingresa a la web de practica
    And Se clickea en MyAccount en la barra de navegacion superior

  @RegistroFallido @Smoke
  Scenario Outline: Registro con credenciales invalidas por <credenciales>
    And En Username se ingresa el valor '<user>' y en Password el valor '<pass>'
    When Se hace click en el boton Register
    Then Se debe mostrar el mensaje de error del registro.

    Examples:
      | user                  | pass      | credenciales               |
      | alberto.paz@gmail.com |           | Mail correcto y Pass vacio |
      |                       |           | Mail y Pass vacio          |
      |                       | P3drQPez1 | Mail vacio y Pass correcta |