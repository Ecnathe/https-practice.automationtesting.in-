@Shop
Feature: Shop

  Background:
    Given Se ingresa a la web de practica
    And Se clickea el boton 'Shop' en la barra de navegacion superior

  @CategoryFilter @Smoke
  Scenario Outline: Filtrar por categoria <CatFilt>
    When Se clickea en '<CatFilt>'
    Then Solo se visualizan los productos de dicha categoria
    Examples:
      | CatFilt    |
      | Android    |
      | HTML       |
      | JavaScript |
      | Selenium   |

  @SortBy @Smoke
  Scenario Outline: Validar filtro por <Filtro>
    When Se selecciona la opcion '<Filtro>' en el menu depslegable
    Then Se visualizan los productos filtrados
    Examples:
      | Filtro                   |
      | Sort by Popularity       |
      | Sort by Average ratings  |
      | Sort by Newness ratings  |
      | Sort by Low to High Item |
      | Sort by High to Low Item |

  @OnSale @Smoke
  Scenario: Validar descuento realizado en productos con la etiqueta 'On Sale'
    When Se clickea un producto con la etiqueta 'On Sale'
    Then Se visualiza el precio antiguo tachado para los productos con esta etiqueta