package org.no.hook.page.element.abstraction;

import org.no.hook.page.element.ifase.Label;
import org.openqa.selenium.WebElement;

public class AbstractLabel extends AbstractElement implements Label {
    protected AbstractLabel(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Gets whole text of an element
     * @return
     */
    @Override
    public String text() {
        return wrappedElement.getText();
    }
}
