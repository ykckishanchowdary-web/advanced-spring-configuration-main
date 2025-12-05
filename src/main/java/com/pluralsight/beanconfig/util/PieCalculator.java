package com.pluralsight.beanconfig.util;

import org.springframework.stereotype.Component;

public class PieCalculator {
    public int calculateSlices(int diameter) {
        return (int) Math.floor((Math.PI * diameter * diameter) / 14.0);
    }
}
