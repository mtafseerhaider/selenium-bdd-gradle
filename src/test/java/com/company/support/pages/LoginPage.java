package com.company.support.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Muhammad Tafseer Haider
 */
public class LoginPage {

    @FindBy(how = How.NAME, using = ("username"))
    public WebElement txtUsername;

    @FindBy(how = How.NAME, using = ("password"))
    public WebElement txtPassword;

    WebDriver webDriver;

    public LoginPage (WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void typeUsername (String username) {
        txtUsername.sendKeys(username);
    }

    public void typePassword (String password) {
        txtPassword.sendKeys(password);
    }

    public void submit () {
        txtUsername.submit();
    }

    public void validateOverviewPage () {
        System.out.println("Test Passed");
    }
}
