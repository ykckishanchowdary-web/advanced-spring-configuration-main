package com.pluralsight.beanconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//proxymode=traget class means I want you to call underlying target class each time you go through and prxy it.
@Component
@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OrderIdGenerator {

    private final String id = java.util.UUID.randomUUID().toString();

    public String getId(){
        return id;
    }
}
