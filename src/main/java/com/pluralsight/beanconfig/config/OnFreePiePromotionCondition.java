package com.pluralsight.beanconfig.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnFreePiePromotionCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
        String promoEnabled = System.getProperty("pieshop.freepie.enabled");
        return "true".equalsIgnoreCase(promoEnabled);
    }

}
