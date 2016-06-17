package org.no.page.element.factory.iface;

import org.no.page.element.abstraction.AbstractElement;
import org.no.page.element.iface.Element;
import org.openqa.selenium.WebElement;

public interface ElementFactory {
    <T extends AbstractElement> T create(Class<T> element, WebElement wrappedElement);
}
