package org.no.page.element.abstraction;

import org.no.page.element.iface.Label;

public class AbstractLabel extends AbstractElement implements Label {
    /**
     * Gets whole text of an element
     * @return
     */
    @Override
    public String text() {
        return wrappedElement.getText();
    }
}
