package org.no.page.decorator.factory;

import org.no.page.element.abstraction.AbstractElement;
import org.openqa.selenium.WebElement;

public interface ElementFactory {
    <T extends AbstractElement> T create(Class<T> element, WebElement wrappedElement);
}
