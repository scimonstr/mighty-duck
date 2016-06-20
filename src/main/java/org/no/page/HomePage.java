package org.no.page;

import org.no.annotation.Container;
import org.no.page.abstraction.AbstractPage;
import org.no.page.element.container.Calculator;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @Container
    @FindBy(css = "#sciout")
    private Calculator calculator;

    public boolean isCalculatorDisplayed() {
        return calculator.isDisplayed();
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
