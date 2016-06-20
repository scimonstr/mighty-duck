package org.no.test.suite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FunctionalTests.class, PageLoadingTests.class})
public class AllTests {
    private static Logger logger = LogManager.getLogger();

    @BeforeClass
    public static void setup() {
        logger.debug("Tests execution started");
    }

    @AfterClass
    public static void tearDown() {
        logger.debug("Tests execution ended");
    }

}
