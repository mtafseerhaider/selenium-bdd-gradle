package com.company.steps;

import com.company.support.base.AutomationBase;
import com.company.support.pages.LoginPage;
import com.company.support.utils.AppLauncher;
import io.cucumber.java.en.Given;

/**
 * @author Muhammad Tafseer Haider
 */
public class HomeSteps extends AutomationBase {
    AppLauncher applauncher = new AppLauncher(getDriver());
    LoginPage loginPage = new LoginPage(getDriver());

    @Given("I am at the login page of the Para Bank Home Page")
    public void navigateToParabankHomePage()
    {
        applauncher.navigateToParaBankApplication();
    }

//    @Given("I am at the login page of the Para Bank Home Page Again")
//    public void navigateToParabankHomePageAgain()
//    {
//        applauncher.navigateToParaBankApplication();
//    }
}
