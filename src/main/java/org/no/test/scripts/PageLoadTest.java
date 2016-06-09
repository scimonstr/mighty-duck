package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class PageLoadTest {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void testPageLoad() throws InterruptedException {
        logger.debug("Test \"testPageLoad\" is being executed");
        Assert.assertTrue(true);
    }
}
