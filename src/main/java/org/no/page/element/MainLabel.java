package org.no.page.element;

import org.no.page.element.abstraction.AbstractLabel;

public class MainLabel extends AbstractLabel{
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
