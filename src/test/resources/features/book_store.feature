Feature: Book Store

  @bookStore
  Scenario Outline: Book Store
    Given i am on the demoqa page <Fila>
      | Ruta Excel                        | Pestana   |
      | src/test/resources/data/data.xlsx | bookStore |
    When i create the user with my credentials
    And select the books to save them in my collection
    Then the deletion of the books and the profile will be validated

    Examples:
      | Fila |
      | 1    |