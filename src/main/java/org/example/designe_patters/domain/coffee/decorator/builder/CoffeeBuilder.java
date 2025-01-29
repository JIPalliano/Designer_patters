package org.example.designe_patters.domain.coffee.decorator.builder;

import org.example.designe_patters.domain.coffee.SimpleCoffee;
import org.example.designe_patters.domain.coffee.decorator.*;

public class CoffeeBuilder {
    private Coffee coffee;

    public CoffeeBuilder() {
        this.coffee = new SimpleCoffee();
    }

    public CoffeeBuilder addMocha(){
        this.coffee = new MochaDecorator(coffee);
        return this;
    }
    public CoffeeBuilder addWippedCream(){
        this.coffee = new WippedCreamDecorator(coffee);
        return this;
    }
    public CoffeeBuilder addCaramel(){
        this.coffee = new CaramelDecorator(coffee);
        return this;
    }
    public CoffeeBuilder addMilk(){
        this.coffee = new MilkDecorator(coffee);
        return this;
    }
    public CoffeeBuilder addSugar(){
        this.coffee = new SugarDecorator(coffee);
        return this;
    }
    public String build(){
        return "Description: " + coffee.getDescription().block() + " -> $" + coffee.cost().block();
    }

}
