@HomePage
Feature: Home page

  Background:
    Given Se ingresa a la web de practica

#  1) Open the browser
#  2) Enter the URL “http://practice.automationtesting.in/”
#  3) Click on Shop Menu
#  4) Now click on Home menu button
#  5) Test whether the Home page has Three Arrivals only
#  6) The Home page must contains only three Arrivals
#  7) Now click the image in the Arrivals
#  8) Test whether it is navigating to next page where the user can add that book into his basket.
#  9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
#  10) Click on the Add To Basket button which adds that book to your basket
#  11) User can view that Book in the Menu item with price.
#  12) Now click on Item link which navigates to proceed to check out page.
#  13)Now user can find total and subtotal values just above the Proceed to Checkout button.
#  14)The total always < subtotal because taxes are added in the subtotal
#  15)Now click on Proceed to Check out button which navigates to payment gateway page.
#  16)User can view Billing Details,Order Details,Additional details and Payment gateway details.
#  17)Now user can fill his details in billing details form and can opt any payment in the payment gateway like Direct bank transfer,cheque,cash or paypal.
#  18)User has the feasibility to add coupon in the payment gateway page and also he can find billing,order and additional details.


  @arrivalsAddToCart @Smoke @Do
  Scenario: Agregar items al carrito desde Arrivals y completar compra.
    When Se clickea la imagen del arrival en la posicion '1'
    And Se visualizan los detalles producto seleccionado
    And Se clickea en Add To Basket
    And Se visualiza el texto confirmando que se ha agregado al carrito y se clickea en View Basket
    And Se selecciona el boton Proceed to Checkout
    And Se valida que en la seccion Your order el Total sea mayor al Subtotal
#    And Se debera poder agregar un cupon en la seccion "Have a coupon?" en caso de tener uno
#    And Se completan los campos del formulario "Billing Details", se selecciona el metodo de pago y se hace click en "Place Order"
#    Then Se podra visualizar la pagina con los detalles de la compra.


