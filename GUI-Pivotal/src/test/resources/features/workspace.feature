Feature: create workspace
  Background:
    Given I log in with username and password

#  Scenario: Create a new workspace for an user
#    When  I navigate to Workspace Dashboard page
#    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
#    Then  workspace page should be displayed
#    When  I navigate to Workspace Dashboard page
#    Then  workspace Dashboard page should be displayed the new workspace

#  Scenario: Delete a workspace in Pivotal Tracker
#    When I navigate to Workspace Dashboard page
#    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
#    Then workspace page should be displayed
#    When I go to the more page and delete the Workspace with the name "Test_Workspace".
#    Then I can see a yellow message "Test_Workspace was successfully deleted."

  Scenario: Create a workspace that has an associated Stories
    When I navigate to Workspace Dashboard page
    And  I create a new Workspace from Workspace Dashboard page with "Test_Workspace" value
    Then workspace page should be displayed
    When I navigate to Workspace page
    Then I attach a workspace to  a project



#  Scenario: Create a workspace name with only numbers in a form
#    Given   I log in with username and password
#    When  I navigate to Workspace Dashboard page
#    When  I create a new Workspace from Workspace Dashboard page with "1234" values
#    Then  workspace page should be displayed
#
#  Scenario: Create a workspace name with value null in a form
#    Given   I log in with username and password
#    When  I navigate to Workspace Dashboard page
#    When  I create a new Workspace from Workspace Dashboard page with " " values
#    Then  workspace page should be displayed
#
#  Scenario: Create a workspace name filled only with the space bar in a form.
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with the space bar data
#    And	  I click on the create button
#    Then    I verify message error "Workspace name can't be blank."
#
#  Scenario: Create a workspace name filled only with the space bar in a form.
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with the space bar data
#    And	  I click on the create button
#    Then    I verify message error "Workspace name can't be blank."