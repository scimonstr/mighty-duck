package org.no.page.element.abstraction;

import org.openqa.selenium.WebElement;

public class AbstractElement implements Element{

     WebElement wrappedElement;

    /**
     * Returns true if an element is displayed on the page
     */
    @Override
    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }
}
