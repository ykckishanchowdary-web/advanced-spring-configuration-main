package com.pluralsight.beanconfig.cache;


public class InMemoryPieCache implements PieCache {

    @Override
    public void cachePie(String pieName){
        System.out.println("Caching pie in memory: " + pieName);
    }
}
