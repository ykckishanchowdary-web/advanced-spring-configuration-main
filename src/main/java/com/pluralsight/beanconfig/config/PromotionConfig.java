package com.pluralsight.beanconfig.config;


import com.pluralsight.beanconfig.promo.FreePiePromotionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PromotionConfig {

    @Bean
    @Conditional(OnFreePiePromotionCondition.class)
    public FreePiePromotionService freePiePromotionService(){
        return new FreePiePromotionService();
    }
}
