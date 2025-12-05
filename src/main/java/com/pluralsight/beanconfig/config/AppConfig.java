package com.pluralsight.beanconfig.config;

import com.pluralsight.beanconfig.util.PieCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PieCalculator pieCalculator() {
        return new PieCalculator();
    }
}
