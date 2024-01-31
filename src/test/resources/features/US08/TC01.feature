@UI
Feature: User can see transportation times by clicking “Horaires”.

  Background:
    Given user goes to homepage
    And user clicks to horaires button

  @US08_TC01
  Scenario: TC001-User can view train transportation times by clicking “Horaires”.
    And Bayeux is entered as the settlement
    Then Nomad train options appear
    And Clicks to Nomad train options
    Then Train times are displayed

  @US08_TC02
  Scenario: TC002-User can view car transportation times by clicking “Horaires”.
    And Bayeux is entered as the settlement
    Then Nomad car options appear
    And Clicks to Nomad car options
    Then Car times are displayed

  @US08_TC03
  Scenario: TC003-User can view bus transportation times by clicking “Horaires”.
    And Bayeux is entered as the settlement
    Then bus options appear
    And Clicks to bus options
    Then Bus times are displayed
