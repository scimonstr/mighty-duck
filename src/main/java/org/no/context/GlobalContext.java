package org.no.context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class GlobalContext {
    static {
        Properties properties = new Properties();
        try {
            properties.load(GlobalContext.class.getClassLoader().getResourceAsStream("project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            appURL = new URL(properties.getProperty("base_url"));
        } catch (MalformedURLException e) {
            throw new RuntimeException("App url is malformed");
        }
    }

    private static final URL appURL;

    private GlobalContext() {
    }

    public static URL getAppURL() {
        return appURL;
    }
}
