package org.no.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//marker annotation for elements module
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Module {
}
