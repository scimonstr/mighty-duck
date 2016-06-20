package org.no.context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class GlobalContext {
    static {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        Properties properties = new Properties();
        try {
            properties.load(GlobalContext.class.getClassLoader().getResourceAsStream("project.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Properties file is not available");
        }
        try {
            appURL = new URL(properties.getProperty("base_url"));
        } catch (MalformedURLException e) {
            throw new RuntimeException("App url is malformed");
        }
    }

    private static final URL appURL;
    private static WebDriver driver = new ChromeDriver();

    private GlobalContext() {
    }

    public static synchronized WebDriver getDriver() {
        driver = driver.toString().contains("null") ? new ChromeDriver() : driver;
        return driver;
    }

    public static URL getAppURL() {
        return appURL;
    }
}
