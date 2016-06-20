package org.no.page;

import org.no.page.decorator.ExtendedFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);
    }
}
