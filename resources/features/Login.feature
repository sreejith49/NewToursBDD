
Feature: newTours login test

  Scenario: login to newTours web application
    Given when user navigates to newTours application
    When user provides valid username and password
    And clicks on the submit button
    Then user should get redirected to flight finder page

 