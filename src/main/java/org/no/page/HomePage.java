package org.no.page;

import org.no.annotation.Module;
import org.no.page.module.Calculator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @Module
    @FindBy(css = "#sciout")
    private Calculator calculator;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCalculatorDisplayed() {
        return calculator.isDisplayed();
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
