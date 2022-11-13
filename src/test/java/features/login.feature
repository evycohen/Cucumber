Feature: Login
  Scenario: Successful login with valid credentials
    Given User Lunch Chrome Browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User enter email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Logout link
    Then Page Title should be "Your store. Login"
    And close Browser