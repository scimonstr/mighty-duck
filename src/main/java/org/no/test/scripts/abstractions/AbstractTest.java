package org.no.test.scripts.abstractions;

import org.junit.After;
import org.junit.Before;
import org.no.context.GlobalContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Properties;

public class AbstractTest {
    static {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    }

    protected WebDriver driver;

    @Before
    public void setup() {
        //actions to be performed after each test
        driver = new ChromeDriver();
        driver.get(GlobalContext.getAppURL().toString());
    }

    @After
    public void tearDown() {
        //actions to be performed after each test
        driver.quit();
    }
}
