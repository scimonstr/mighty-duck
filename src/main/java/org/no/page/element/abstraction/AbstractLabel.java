package org.no.page.element.abstraction;

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
