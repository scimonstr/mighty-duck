package org.no.page.abstractions;

import org.no.page.iface.Page;
import org.openqa.selenium.WebDriver;

public class AbstractPage implements Page {
    protected WebDriver driver;
    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void init(WebDriver driver) {

    }
}
