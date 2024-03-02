Feature: Alerts Frame Window

  @frames
  Scenario Outline: Alerts Frame Window
    Given i am on the demoqa page <Fila>
      | Ruta Excel                        | Pestana      |
      | src/test/resources/data/data.xlsx | AlertsFrames |
    When i create the user with my credentials
    And select the alerts frams windows
    And fill out the form
    Then the deletion of the profile will be validated

    Examples:
      | Fila |
      | 1    |