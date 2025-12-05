package com.pluralsight.beanconfig.config;

import com.pluralsight.beanconfig.cache.DistributedPieCache;
import com.pluralsight.beanconfig.cache.InMemoryPieCache;
import com.pluralsight.beanconfig.cache.PieCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CacheConfig {

    @Bean
    @Profile("dev")
    public PieCache inMemoryPieCache(){
        return new InMemoryPieCache();
    }

    @Bean
    @Profile("prod")
    public PieCache distributedPieCache(){
        return new DistributedPieCache();
    }
}
