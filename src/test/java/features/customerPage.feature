Feature:AddNewCustomer
  Scenario: Successful login with valid credentials
    Given User Lunch Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view dashboard navBar
    When User click on customer menu
    And click on customer menu item
    And click on add new button
    Then User can view add new customer page
    When User enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully"
    And close Browser