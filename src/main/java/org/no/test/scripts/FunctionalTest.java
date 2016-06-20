package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.no.page.HomePage;
import org.no.test.scripts.abstractions.AbstractTest;

public class FunctionalTest extends AbstractTest {
    private static final Logger logger = LogManager.getLogger();
    private static final HomePage homePage = new HomePage();

    @Test
    public void functionalScenario1() {
        logger.debug(String.format("Executing %s test", getClass().getSimpleName()));
        homePage.getCalculator().rnd();
        Assert.assertFalse(homePage.getCalculator().getResult().isEmpty());
    }
}
