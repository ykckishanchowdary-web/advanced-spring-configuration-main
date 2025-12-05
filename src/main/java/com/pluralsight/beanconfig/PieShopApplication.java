package com.pluralsight.beanconfig;

import com.pluralsight.beanconfig.cache.PieCache;
import com.pluralsight.beanconfig.notification.PieNotificationService;
import com.pluralsight.beanconfig.promo.FreePiePromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PieShopApplication implements CommandLineRunner {

    @Autowired
    private PieCache pieCache;

    @Autowired(required = false)
    private PieNotificationService notificationService;

    @Autowired(required = false)
    private FreePiePromotionService freePiePromotionService;

    public static void main(String[] args) {
        SpringApplication.run(PieShopApplication.class, args);
    }

    @Override
    public void run(String... args){
        pieCache.cachePie("Apple Crumble");
        if(notificationService!=null){
            notificationService.notifyPieReady("Apple Crumble");
        }
        if(freePiePromotionService!=null){
            freePiePromotionService.announceFreePie();
        }
    }
}
