package org.no.hook.page.element;

import org.no.hook.page.element.abstraction.AbstractButton;
import org.openqa.selenium.WebElement;

public class LoginButton extends AbstractButton{
    protected LoginButton(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Suppose for some reason user needs to click the Login Button twice in order to do a login sequence
     */
    @Override
    public void click() {
        super.click();
        super.click();
    }
}
