package org.no.page.decorator;

import org.no.annotation.Module;
import org.no.page.element.abstraction.AbstractElement;
import org.no.page.decorator.factory.DefaultElementFactory;
import org.no.page.decorator.factory.ElementFactory;
import org.no.page.element.abstraction.Element;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.lang.reflect.Field;

public class ExtendedFieldDecorator extends DefaultFieldDecorator{
    private ElementFactory elementFactory = new DefaultElementFactory();

    public ExtendedFieldDecorator(final SearchContext searchContext) {
        super(new DefaultElementLocatorFactory(searchContext));
    }

    @Override
    public Object decorate(final ClassLoader loader, final Field field) {
        if (field.isAnnotationPresent(Module.class)) {
            return decorateContainer(loader, field);
        }
        if (Element.class.isAssignableFrom(field.getType())) {
            return decorateElement(loader, field);
        }
        return null;
    }

    private Object decorateElement(final ClassLoader loader, final Field field) {
        final WebElement wrappedElement = proxyForLocator(loader, createLocator(field));
        return elementFactory.create((Class<? extends AbstractElement>) field.getType(), wrappedElement);
    }

    private ElementLocator createLocator(final Field field) {
        return factory.createLocator(field);
    }

    private Object decorateContainer(final ClassLoader loader, final Field field) {
        final WebElement wrappedElement = proxyForLocator(loader, createLocator(field));
        final Element container = elementFactory.create((Class<? extends AbstractElement>) field.getType(), wrappedElement);

        PageFactory.initElements(new ExtendedFieldDecorator(wrappedElement), container);
        return container;
    }
}
