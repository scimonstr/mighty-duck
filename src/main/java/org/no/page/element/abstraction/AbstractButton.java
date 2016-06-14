package org.no.page.element.abstraction;

import org.no.page.element.ifase.Button;
import org.openqa.selenium.WebElement;

public class AbstractButton extends AbstractElement implements Button{
    protected AbstractButton(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Perform most simple click on an element
     */
    @Override
    public void click() {
        wrappedElement.click();
    }
}
