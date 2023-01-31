package com.company.steps;

import com.company.support.base.AutomationBase;
import com.company.support.pages.LoginPage;
import com.company.support.utils.AppLauncher;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Muhammad Tafseer Haider
 */
public class LoginSteps extends AutomationBase {

    AppLauncher applauncher = new AppLauncher(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());


    @Given("I am at the login page of the Para Bank Application")
    public void navigateToParabankApplication()
    {
        applauncher.navigateToParaBankApplication();
    }

    @When("I enter valid credentials")
    public void typeValidCredentials()
    {
        loginPage.typeUsername("tautester");
        loginPage.typePassword("password");
        loginPage.submit();
    }

    @Then("I should be taken to the Overview page")
    public void verifyOverviewPage()
    {
        loginPage.validateOverviewPage();
    }

}
