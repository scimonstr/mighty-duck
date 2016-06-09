package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class FunctionalTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void functionalScenario1() {
        logger.debug(String.format("Executing %s test", FunctionalTest.class.getSimpleName()));
    }
}
