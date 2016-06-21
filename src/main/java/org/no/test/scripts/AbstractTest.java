package org.no.test.scripts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.util.concurrent.TimeUnit;

class AbstractTest {
    WebDriver driver;

    @Before
    public void setup() {
        String browser = System.getProperty("browser") != null ? System.getProperty("browser") : "";
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "phantom":
                driver = new PhantomJSDriver();
                break;
            default:
                //if the browser property was not set
                driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(System.getProperty("base_url"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
