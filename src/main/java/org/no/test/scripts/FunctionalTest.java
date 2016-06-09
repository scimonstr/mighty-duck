package org.no.test.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FunctionalTest {
    private static final Logger logger = LogManager.getLogger();

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {{ 1, 1 }, {0, 1}, {2, 2}};
    }

    @Parameterized.Parameter(value = 0)
    public int actual;

    @Parameterized.Parameter(value = 1)
    public int expected;

    @Test
    public void functionalScenario1() {
        logger.debug(String.format("Executing %s test", getClass().getSimpleName()));
        Assert.assertEquals(expected, actual);
    }
}
