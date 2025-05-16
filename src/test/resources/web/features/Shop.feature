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