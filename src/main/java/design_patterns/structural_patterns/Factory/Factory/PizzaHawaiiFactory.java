package design_patterns.structural_patterns.Factory.Factory;


import java.util.Arrays;

public class PizzaHawaiiFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Pizza(30, "fluffy", Arrays.asList("ham", "cheese", "pineapple"));
    }
}
