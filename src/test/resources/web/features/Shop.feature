@Shop
Feature: Shop

  Background:
    Given Se ingresa a la web de practica
    And Se clickea el boton 'Shop' en la barra de navegacion superior

  @CategoryFilter @Smoke
  Scenario Outline: Filtrar por categoria <CatFilt>
    When Se hace click en <CatFilt> del sidebar
    Then Solo se visualizan los productos de la categoria <CatFilt>
    Examples:
      | CatFilt    |
      | Android    |
      | HTML       |
      | JavaScript |
      | selenium   |

  @SortBy @Smoke
  Scenario Outline: Validar filtro por <Filtro>
    When Se selecciona la opcion <Parametro> en el menu depslegable
    Then Se visualizan los productos filtrados
    Examples:
      | Filtro                   | Parametro  |
      | Sort by Popularity       | popularity |
      | Sort by Average ratings  | rating     |
      | Sort by Newness ratings  | date       |
      | Sort by Low to High Item | price      |
      | Sort by High to Low Item | price-desc |

  @OnSale @Smoke
  Scenario: Validar descuento realizado en productos con la etiqueta 'On Sale'
    When Se clickea el primer producto con la etiqueta On Sale
    Then Se visualiza el precio antiguo tachado para los productos con esta etiqueta

  @AddToBasket @Smoke
  Scenario: Add to basket
    And Se agrega al carrito el primer producto de la lista
    And Se clickea en el boton View Basket que se hace visible luego de agregar el producto
    And Se selecciona el boton Proceed to Checkout
    And Se valida que en la seccion Your order el Total sea mayor al Subtotal
    When Se completan los campos del formulario Billing Details, se selecciona el metodo de pago y se hace click en Place Order
    Then Se podra visualizar la pagina con los detalles de la compra.

  @TaxFunction @Smoke @Do
  Scenario Outline: Validar calculo de impuestos segun pais de origen de la compra
    And Se agrega al carrito el primer producto de la lista
    And Se clickea en el boton View Basket que se hace visible luego de agregar el producto
    And Se selecciona el boton Proceed to Checkout
    When Se selecciona el pais <Pais> en el desplegable Country
    Then Se debe visualizar un monto equivalente <Tax> del valor total del producto seleccionado

    Examples:
      | Pais      | Tax |
      | India     | 2%  |
      | Argentina | 5%  |
      | Honduras  | 5%  |
      | Germany   | 5%  |
      | Japan     | 5%  |