package org.no.hook.page.element;

import org.no.hook.page.element.abstraction.AbstractLabel;
import org.openqa.selenium.WebElement;

public class MainLabel extends AbstractLabel{

    protected MainLabel(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Suppose the label contains some not relevant text but it is acceptable from the testing point of view
      * @return
     */
    @Override
    public String text() {
        String labelText = super.text();

        //meaningful text supposed to be delimited by pipe symbol
        return labelText.split("|")[0];
    }
}
