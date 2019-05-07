#Feature: create workspace
#
#  Scenario: I login as a User, to create a workspace with fill valid information in a form
#    Given   Start application from a dashboard page
#    When    I click on the workspace tab
#    And	  I click on the create workspace button
#    And	  I fill the space Workspace Name with valid data
#    And	  I click on the create button
#    Then    I verify "/workspace/{idWorkspace}" url
#    And     workspace page is displayed
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