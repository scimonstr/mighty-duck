package org.no.annotation;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.Assert;
import org.junit.Test;
import org.no.page.HomePage;
import org.no.page.abstraction.AbstractPage;
import org.no.page.element.abstraction.AbstractElement;
import org.no.page.element.container.Calculator;
import org.no.page.element.iface.Element;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ContainerTest {

    @Test
    public void annotatedFieldTest() throws NoSuchFieldException {
        class PageObject {
            @Container
            @FindBy(id = "elementContainerId")
            private Element elementContainer;
        }
        Field elementContainer = null;
        elementContainer = PageObject.class.getDeclaredField("elementContainer");

        Assert.assertTrue("Annotation not found", elementContainer.getAnnotation(Container.class) != null);
    }
}
