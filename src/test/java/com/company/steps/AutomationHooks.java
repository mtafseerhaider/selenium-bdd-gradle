package com.company.steps;

import com.company.support.base.AutomationBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author Muhammad Tafseer Haider
 */
public class AutomationHooks extends AutomationBase {
    @Before
    public void beforeScenario() {
        initiateAutomation();
    }

    @After
    public void afterScenario() {
        closeAutomationDrivers();
    }
}
