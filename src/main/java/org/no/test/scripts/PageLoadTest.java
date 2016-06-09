package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class PageLoadTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void pageLoadScenario1() {
        logger.debug(String.format("Executing %s test", getClass().getSimpleName()));
    }
}
