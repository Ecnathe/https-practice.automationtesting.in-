@HomePage
Feature: Home page

  Background:
    Given Se ingresa a la web de practica

  @Slider @Smoke
  Scenario: Validar que solo haya 3 sliders unicamente en home page
    Then Se valida que solo haya '3' sliders

  @Arrivals @Smoke
  Scenario: Validar que solo haya 3 Arrivals unicamente en home page
    Then Se valida que solo haya '3' arrivals

    @ProductPage @Smoke
  Scenario: Validar que las imagenes de Arrivals sean navegables
    When Se clickea la imagen del arrival en la posicion '1'
    Then Se visualizan los detalles producto seleccionado

