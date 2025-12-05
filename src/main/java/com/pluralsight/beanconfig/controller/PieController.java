package com.pluralsight.beanconfig.controller;

import com.pluralsight.beanconfig.service.PieService;
import com.pluralsight.beanconfig.util.PieCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pie")
public class PieController {

    private final PieService pieService;
    private final PieCalculator pieCalculator;

    @Autowired
    public PieController(PieService pieService, PieCalculator pieCalculator) {
        this.pieService = pieService;
        this.pieCalculator = pieCalculator;
    }

    @GetMapping("/order")
    public String orderPie(@RequestParam String flavor, @RequestParam int diameter) {
        String result = pieService.bakePie(flavor);
        int slices = pieCalculator.calculateSlices(diameter);
        return result + " It will have " + slices + " slices.";
    }
}
