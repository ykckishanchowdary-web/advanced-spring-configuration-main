package com.pluralsight.beanconfig.service;

import org.springframework.stereotype.Component;

@Component
public class PieNotifier {
    public void notifyCustomer(String message) {
        System.out.println("Notifying customer: " + message);
    }
}
