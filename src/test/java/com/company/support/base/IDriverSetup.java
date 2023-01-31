package com.company.support.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Muhammad Tafseer Haider
 */
public interface IDriverSetup {
    WebDriver getWebDriverObject(DesiredCapabilities capabilities);
}