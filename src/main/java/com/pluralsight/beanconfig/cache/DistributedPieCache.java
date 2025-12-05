package com.pluralsight.beanconfig.cache;

public class DistributedPieCache implements PieCache {

    @Override
    public void cachePie(String pieName){
        System.out.println("Caching pie in distributed cache: " + pieName);
    }
}
