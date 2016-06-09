package org.no.hook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.no.test.scripts.Test1;

@RunWith(Suite.class)
@Suite.SuiteClasses({Test1.class})
public class GlobalHook {
    private static Logger logger = LogManager.getLogger();

    @BeforeClass
    public static void setUp() {
        logger.debug("Tests execution started");
    }

    @AfterClass
    public static void tearDown() {
        logger.debug("Tests execution ended");
    }

}
