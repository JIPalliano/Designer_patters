package org.example.designe_patters.domain.coffee;

import org.example.designe_patters.domain.coffee.decorator.Coffee;
import org.example.designe_patters.domain.coffee.decorator.builder.CoffeeBuilder;
import org.springframework.stereotype.Service;

@Service
public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public Double cost() {
        return 0.5;
    }

    public String getCustomCoffee() {
        return new CoffeeBuilder()
                .addCaramel()
                .addSugar()
                .addMilk()
                .addMocha()
                .addWippedCream()
                .build();
    }

}
