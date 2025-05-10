@Home
Feature: Home page

  Background:
    Given Se ingresa a la web de practica

  @Slider
  Scenario: Validar que solo haya 3 sliders unicamente en home page
    Then Se valida que solo haya '3' sliders

  @Arrivals @Do
  Scenario: Validar que solo haya 3 Arrivals unicamente en home page
    Then Se valida que solo haya '3' arrivals