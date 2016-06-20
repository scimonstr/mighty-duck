package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.no.page.HomePage;

public class FunctionalTest extends AbstractTest {
    private final Logger logger = LogManager.getLogger();
    private HomePage homePage;

    @Test
    public void functionalScenario1() {
        homePage = new HomePage(driver);
        logger.debug(String.format("Executing %s test", getClass().getSimpleName()));
        homePage.getCalculator().rnd();
        Assert.assertFalse(homePage.getCalculator().getResult().isEmpty());
    }
}
