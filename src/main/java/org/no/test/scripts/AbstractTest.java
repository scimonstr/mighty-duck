package org.no.test.scripts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    protected WebDriver driver;

    @Before
    public void setup() {
        //actions to be performed after each test
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(5l, TimeUnit.SECONDS);
        driver.get(System.getProperty("base_url"));
    }

    @After
    public void tearDown() {
        //actions to be performed after each test
        driver.quit();
    }
}
