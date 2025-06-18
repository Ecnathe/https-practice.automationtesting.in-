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

  @arrivalsAddToCart @Smoke @Do
  Scenario: Agregar items al carrito desde Arrivals y completar compra.
    When Se clickea la imagen del arrival en la posicion '1'
    And Se visualizan los detalles producto seleccionado
    And Se clickea en Add To Basket
    And Se visualiza el texto confirmando que se ha agregado al carrito y se clickea en View Basket
    And Se selecciona el boton Proceed to Checkout
    And Se valida que en la seccion Your order el Total sea mayor al Subtotal
    And Se debera poder agregar un cupon en la seccion Have a coupon? en caso de tener uno
    When Se completan los campos del formulario Billing Details, se selecciona el metodo de pago y se hace click en Place Order
    Then Se podra visualizar la pagina con los detalles de la compra.


