package org.no.page.element.factory;

import org.no.page.element.abstraction.AbstractElement;
import org.no.page.element.factory.iface.ElementFactory;
import org.no.page.element.iface.Element;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DefaultElementFactory implements ElementFactory {
    @Override
    public <T extends AbstractElement> T create(Class<T> elementClass, WebElement wrappedElement) {
        T elementInstance = null;
        try {
            elementInstance = elementClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Field wrappedElementField = null;
        try {
            wrappedElementField = AbstractElement.class.getDeclaredField("wrappedElement");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        wrappedElementField.setAccessible(true);
        try {
            wrappedElementField.set(elementInstance, wrappedElement);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return elementInstance;
    }
}
