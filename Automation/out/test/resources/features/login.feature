Feature: Project management
  @Project
  Scenario: Create a new project when user has at least 1 project
    Given I log in with username "Test_User_Jala" and password "Control123"
    When I navigate to Project Dashboard page
      And Icreate a new Project from Project Dashboard page with the following values
