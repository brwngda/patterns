package design_patterns.structural_patterns.Factory.AbstractMethod;


import java.util.Arrays;

public class PizzaSalamiFactory {

    public static Pizza createPizza() {
        return new Pizza(50, "thin", Arrays.asList("salami", "cheese", "mushrooms"));
    }
}
