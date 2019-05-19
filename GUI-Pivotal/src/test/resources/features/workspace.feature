Feature: create workspace
  Background:
    Given I create a project with the name "Test_Project"
    Given I log in with username and password


  @deleteNewWorkspace @deleteProject
  Scenario: Create a new workspace for an user
    When I navigate to Workspace Dashboard page
    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
    Then workspace page should be displayed
    When I navigate to Workspace page
    And  I attach a workspace to a project
    Then workspace page should be displayed with the project
    When I navigate to Workspace Dashboard page
    Then workspace Dashboard page should be displayed the new workspace

  @deleteNewWorkspace @deleteProject
  Scenario: Update a new workspace
    When I navigate to Workspace Dashboard page
    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
    Then workspace page should be displayed
    When I update a Workspace from Workspace Settings with the name "Update_Workspace"
    Then I can see a green message "Changes saved."
    When I navigate to Workspace Dashboard page
    Then workspace Dashboard page should be displayed the new workspace

  @deleteProject
  Scenario: Delete a workspace in Pivotal Tracker
    When I navigate to Workspace Dashboard page
    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
    Then workspace page should be displayed
    When I go to the more page and delete the Workspace with the name "Test_Workspace".
    Then I can see a yellow message "Test_Workspace was successfully deleted."

