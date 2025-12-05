package com.pluralsight.beanconfig.service;

import org.springframework.stereotype.Service;

@Service
public class PieService {
    public String bakePie(String flavor) {
        return "Baking a " + flavor + " pie!";
    }
}
