package com.pluralsight.beanconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private final SalesReportService reportService;

    @Autowired
    public ReportController(SalesReportService reportService){
        this.reportService=reportService;
    }

    @GetMapping("/report")
    public String getSalesReport(){
        return reportService.generateReport();
    }


}
