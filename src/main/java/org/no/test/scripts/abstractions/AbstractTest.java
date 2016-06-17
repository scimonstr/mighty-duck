package org.no.test.scripts.abstractions;

import org.junit.After;
import org.junit.Before;
import org.no.context.GlobalContext;
import org.openqa.selenium.WebDriver;

public class AbstractTest {
    private WebDriver driver = GlobalContext.getDriver();

    @Before
    public void setup() {
        //actions to be performed after each test
    }

    @After
    public void tearDown() {
        //actions to be performed after each test
    }
}
