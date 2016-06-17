package org.no.test.suite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.no.test.scripts.FunctionalTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({FunctionalTest.class})
public class FunctionalTests {
    private static final Logger logger = LogManager.getLogger();

    @BeforeClass
    public static void setupPageLoadingSuite() {
        logger.debug(String.format("Performing setup for %s suite", FunctionalTests.class.getSimpleName()));
    }

    @AfterClass
    public static void tearDownPageLoadingSuite() {
        logger.debug(String.format("Performing tear down for %s suite", FunctionalTests.class.getSimpleName()));
    }
}
