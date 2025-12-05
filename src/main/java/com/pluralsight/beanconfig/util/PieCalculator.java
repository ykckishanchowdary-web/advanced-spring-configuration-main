package com.pluralsight.beanconfig.util;

public class PieCalculator {
    public int calculateSlices(int diameter) {
        return (int) Math.floor((Math.PI * diameter * diameter) / 14.0);
    }
}
