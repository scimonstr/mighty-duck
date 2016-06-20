package org.no.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.no.page.element.abstraction.Element;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Field;

public class ModuleAnnotationTest {

    @Test
    public void annotatedFieldTest() throws NoSuchFieldException {
        class PageObject {
            @Module
            @FindBy(id = "elementContainerId")
            private Element elementContainer;
        }
        Field elementContainer = null;
        elementContainer = PageObject.class.getDeclaredField("elementContainer");

        Assert.assertTrue("Annotation not found", elementContainer.getAnnotation(Module.class) != null);
    }
}
