package design_patterns.structural_patterns.Factory.Factory;


import java.util.Arrays;

public class PizzaSalamiFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Pizza(50, "thin", Arrays.asList("salami", "cheese", "mushrooms"));
    }
}
