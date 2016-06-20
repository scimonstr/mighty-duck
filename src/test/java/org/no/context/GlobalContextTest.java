package org.no.context;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.Properties;

import static org.junit.Assert.*;

public class GlobalContextTest {
    @Test
    public void getAppURLTest() throws Exception {
        URL appURL = GlobalContext.getAppURL();
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("project.properties"));
        Assert.assertEquals("URLs are not equal", properties.get("base_url"), appURL.toString());
    }
}