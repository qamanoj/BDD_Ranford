Feature: Excel

  Scenario Outline: validate the excel sheet datadriven
    Given launch the site
    When homepage should be displayed with login fields
    Then enter the userid and password fields
    Then click on bramnches button
    Then click on newBranch button
    Then enter all the data with excel "<rowindex>" dataset
		Then click on submit button
    Then handel the branch creation popUp
    
    Examples: 
      | rowindex |
      |        1 |
      |        2 |
      |        3 |
      |        4 |
      
