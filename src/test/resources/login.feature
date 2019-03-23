Feature: Login

  Scenario: validate the title of Homepage
    Given launch the site
    When check the title with "KEXIM BANK" data
    Then homepage should be displayed with login fields
    Then close site

  Scenario: validate the login field
    Given launch the site
    When enter the userid and password fields
    Then branches button should be display

  Scenario Outline: verify branches button with newbranch creation
    Given launch the site
    When enter the userid and password fields
    When click on bramnches button
    Then click on newBranch button
    Then enter the BranchName "<BranchName>"
    Then enter the AddressOne "<Address1>"
    Then enter the AddressTwo "<Address2>"
    Then enter the AddressThree "<Address3>"
    Then enter the Area "<Area>"
    Then enter the Zipcode "<Zipcode>"
    Then enter the Country "<Country>"
    Then enter the State "<State>"
    Then enter the City "<City>"
    Then click on submit button
    Then handel the branch creation popUp

    Examples: 
      | BranchName  | Address1  | Address2 | Address3   | Area       | Zipcode | Country | State | City  |
      | Manoj Kumar | Bangalore | Hydrabad | Marathalli | Marathalli |   12345 | INDIA   | Delhi | Delhi |
