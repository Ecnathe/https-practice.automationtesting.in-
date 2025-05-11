@Shop
Feature: Shop

  Background:
    Given Se ingresa a la web de practica
    And Se clickea el boton 'Shop' en la barra de navegacion superior

  @PriceFilter @Smoke
  Scenario: Filtrar por rango de precio
    When Se ajusta el filtro de valores entre '150' y '450'
    And Se clickea el boton 'Filter'
    Then Se visualizan los productos segun el filtro aplicado
