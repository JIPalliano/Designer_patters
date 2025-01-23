package org.example.designe_patters.controller;

import lombok.RequiredArgsConstructor;
import org.example.designe_patters.domain.coffee.SimpleCoffee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/canteen")
@RequiredArgsConstructor
public class CanteenController {

    private final SimpleCoffee coffee;

    @PostMapping
    public String getCustomCoffee() {
        return coffee.getCustomCoffee();
    }


}
