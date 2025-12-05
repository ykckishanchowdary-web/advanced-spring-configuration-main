package com.pluralsight.beanconfig.config;


import com.pluralsight.beanconfig.notification.EmailPieNotificationService;
import com.pluralsight.beanconfig.notification.PieNotificationService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {

    @Bean
    @ConditionalOnProperty(name = "notification.enabled", havingValue = "true")
    public PieNotificationService pieNotificationService(){
        return new EmailPieNotificationService();
    }
}
