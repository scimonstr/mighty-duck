package org.no.hook.page.element.abstraction;

import org.no.hook.page.element.ifase.Element;
import org.openqa.selenium.WebElement;

public class AbstractElement implements Element{
    protected WebElement wrappedElement;

    protected AbstractElement(WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    /**
     * Returns true if an element is displayed on the page
     */
    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }
}
