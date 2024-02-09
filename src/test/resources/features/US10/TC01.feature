
Feature: The user verifies that the headlines of her news in the “Actualités” menu are also included in the news text.

  @US10_TC01
  Scenario: TC001-The user verifies that the headlines of her news in the “Actualités” menu are also included in the news text.
    Given user goes to homepage
    And user clicks to menu button
    Given Click on the Actualités section from the Infos Services section.
    And Verify that news headlines are the same as in the text
