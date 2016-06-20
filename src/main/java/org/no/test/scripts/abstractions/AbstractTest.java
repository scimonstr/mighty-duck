package org.no.test.scripts.abstractions;

import org.junit.After;
import org.junit.Before;
import org.no.context.GlobalContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractTest {
    private WebDriver driver = GlobalContext.getDriver();

    @Before
    public void setup() {
        //actions to be performed after each test
        driver.get(GlobalContext.getAppURL().toString());
    }

    @After
    public void tearDown() {
        //actions to be performed after each test
        driver.quit();
    }
}
