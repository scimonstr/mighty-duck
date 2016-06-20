package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.no.context.GlobalContext;
import org.no.page.HomePage;
import org.no.test.scripts.abstractions.AbstractTest;
import org.openqa.selenium.WebDriver;

public class PageLoadTest extends AbstractTest{
    private final Logger logger = LogManager.getLogger();
    private HomePage homePage;

    @Test
    public void pageLoadScenario1() {
        homePage = new HomePage(driver);
        logger.debug(String.format("Executing %s test", getClass().getSimpleName()));
        Assert.assertTrue(homePage.isCalculatorDisplayed());
    }
}
