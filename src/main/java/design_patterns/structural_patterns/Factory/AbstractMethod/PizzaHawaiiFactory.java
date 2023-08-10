package design_patterns.structural_patterns.Factory.AbstractMethod;

import java.util.Arrays;

public abstract class PizzaHawaiiFactory {

    public static Pizza createPizza() {
        return new Pizza(30, "fluffy", Arrays.asList("ham", "cheese", "pineapple"));
    }
}
