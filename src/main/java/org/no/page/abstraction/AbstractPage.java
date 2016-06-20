package org.no.page.abstraction;

import org.no.context.GlobalContext;
import org.no.page.decorator.ExtendedFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    public AbstractPage() {
        PageFactory.initElements(new ExtendedFieldDecorator(GlobalContext.getDriver()), this);
    }
}
