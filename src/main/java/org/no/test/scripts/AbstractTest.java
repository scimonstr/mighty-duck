package org.no.test.scripts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

class AbstractTest {
    WebDriver driver;

    @Before
    public void setup() {
        String browser = System.getProperty("browser") != null ? System.getProperty("browser") : "";
        switch (System.getProperty("browser")) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
                //if the browser property was not set
                driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(System.getProperty("app_url"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
