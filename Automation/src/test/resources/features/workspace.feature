Feature: create workspace

  Scenario: Create a new workspace for an user
    Given I log in with username "Test_User_Jala" and password "Control123"
    When  I navigate to Workspace Dashboard page
    When  I create a new Workspace from Workspace Dashboard page with "New Workspace" values
    Then  workspace page should be displayed

#
#  Scenario: I login as a User, to create a workspace name with only numbers in a form
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with numbers data
#    And	  I click on the create button
#    Then    I verify "/workspace/{idWorkspace}" url
#    And     workspace page is displayed
#
#  Scenario: I login as a User, to create a workspace name with value null in a form
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with value null data
#    And	  I click on the create button
#    Then    I verify message error "Workspace name can't be blank."
#
#  Scenario: I login as a User, to create a workspace name filled only with the space bar in a form.
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with the space bar data
#    And	  I click on the create button
#    Then    I verify message error "Workspace name can't be blank."
#
#  Scenario: I login as a User, to create a workspace name filled only with the space bar in a form.
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with the space bar data
#    And	  I click on the create button
#    Then    I verify message error "Workspace name can't be blank."