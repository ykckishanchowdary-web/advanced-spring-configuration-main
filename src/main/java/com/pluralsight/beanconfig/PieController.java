package com.pluralsight.beanconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PieController {

    private final OrderIdGenerator orderIdGenerator;

    @Autowired
    public PieController(OrderIdGenerator orderIdGenerator){
        this.orderIdGenerator = orderIdGenerator;
    }

    @GetMapping("/order")
    public String getOrder(){
        return "Order ID: " + orderIdGenerator.getId();
    }
}
