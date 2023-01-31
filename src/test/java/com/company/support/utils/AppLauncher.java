package com.company.support.utils;

import com.company.support.base.AutomationBase;
import org.openqa.selenium.WebDriver;

/**
 * @author Muhammad Tafseer Haider
 */
public class AppLauncher extends AutomationBase {

    private WebDriver webDriver;

    public AppLauncher (WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void navigateToParaBankApplication ()
    {
        webDriver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
}