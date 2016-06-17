package org.no.page.element;

import org.no.page.element.abstraction.AbstractButton;

public class CalcButton extends AbstractButton{

    /**
     * Suppose for some reason user needs to click the Button twice
     */
    @Override
    public void click() {
        super.click();
        super.click();
    }
}
