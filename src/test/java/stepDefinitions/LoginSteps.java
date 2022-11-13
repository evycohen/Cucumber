package org.example.stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.driver.Driver;
import org.example.pageObject.DashBoardPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    @Given("User Lunch Chrome Browser")
    public void user_lunch_chrome_browser() {
        Driver.setDriver();
        loginPage=new LoginPage();
    }
    @When("User Opens URL {string}")
    public void user_opens_url(String url) {
        Driver.getDriver().get(url);
    }
    @When("User enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String email, String password) {
        loginPage.setEmail(email);
        loginPage.setPassword(password);
    }
    @When("Click on Login")
    public void click_on_login() {
       dashBoardPage= loginPage.login();
    }
    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
       Assert.assertEquals(title,dashBoardPage.getPageTitle());
    }
    @When("User click on Logout link")
    public void user_click_on_logout_link() {
         dashBoardPage.logout();
    }
    @Then("close Browser")
    public void close_browser() {
        Driver.unloadDriver();
    }

}
