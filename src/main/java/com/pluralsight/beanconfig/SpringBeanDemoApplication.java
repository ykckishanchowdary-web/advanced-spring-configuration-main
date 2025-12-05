package com.pluralsight.beanconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class SpringBeanDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBeanDemoApplication.class, args);

        System.out.println("Beans registered in ApplicationContext:");
        Arrays.stream(context.getBeanDefinitionNames())
                .sorted()
                .forEach(System.out::println);
    }
}
