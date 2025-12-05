package com.pluralsight.beanconfig;


import com.pluralsight.beanconfig.annotation.LoggedLazyComponent;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
@LoggedLazyComponent("sales Reporting Services")
public class SalesReportService {

    public SalesReportService(){
        System.out.println("Initializing SalesReportService...(expensive operation simulated)");

        try{
            Thread.sleep(10000); // Simulate slow, resource-heavy initializion
            System.out.println("we are finally initialized!");
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public String generateReport() {
        return "Sales report: 42 pies sold today";
    }
}
