@HomePage
Feature: Home page

  Background:
    Given Se ingresa a la web de practica

  @Slider @Smoke
  Scenario: Validar que solo haya 3 sliders unicamente en home page
    Then Se valida que solo haya '3' sliders

  @Arrivals @Smoke @Do
  Scenario: Validar que solo haya 3 Arrivals unicamente en home page
    Then Se valida que solo haya '3' arrivals

  Scenario: Validar que las imagenes de Arrivals sean navegables
    When

