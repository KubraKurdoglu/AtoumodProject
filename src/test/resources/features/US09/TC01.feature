
Feature: User can view alternative transportation option information by navigating the map from the "Autour de Vous" menu in the APK and selecting a transportation point and stop.

  Background:
    Given user goes to homepage
    And user clicks to horaires button

  @US09_TC01
  Scenario: TC001-User can view train transportation times by clicking “Horaires”.
    And Bayeux is entered as the settlement
    #Then Nomad train options appear
    #And Clicks to Nomad train options
    #Then Train times are displayed
