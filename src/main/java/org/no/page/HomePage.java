package org.no.page;

import org.no.annotations.Container;
import org.no.context.GlobalContext;
import org.no.page.element.container.Calculator;
import org.no.page.decorator.ExtendedFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @Container
    @FindBy(css = "#sciout")
    private Calculator calculator;

    public HomePage() {
        PageFactory.initElements(new ExtendedFieldDecorator(GlobalContext.getDriver()), this);
    }

    public boolean isCalculatorDisplayed() {
        return calculator.isDisplayed();
    }

    public Calculator getCalculator() {
        return calculator;
    }
}
