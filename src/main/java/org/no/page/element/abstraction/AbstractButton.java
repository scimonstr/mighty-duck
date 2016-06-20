package org.no.page.element.abstraction;

public class AbstractButton extends AbstractElement implements Button{
    /**
     * Perform most simple click on an element
     */
    @Override
    public void click() {
        wrappedElement.click();
    }
}
