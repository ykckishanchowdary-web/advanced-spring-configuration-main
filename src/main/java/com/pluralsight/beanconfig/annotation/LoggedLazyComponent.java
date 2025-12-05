package com.pluralsight.beanconfig.annotation;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//LoggedLazyComponent is used to sets up some basic paramters that we want to use accross all of our beans
//Target saying what type of interface it is going to be
//Retention Policy is runtime meaning that we want to stay with its declaration while running so that spring can loook at it and use it
// Lazy -> it is lazily loaded
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
@Lazy
public @interface LoggedLazyComponent {

    String value() default "";
}
