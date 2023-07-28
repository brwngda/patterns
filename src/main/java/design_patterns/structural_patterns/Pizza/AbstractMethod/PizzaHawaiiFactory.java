package design_patterns.structural_patterns.Pizza.AbstractMethod;

public abstract class PizzaHawaiiFactory {

    public static Pizza createPizza() {
        return new Pizza(30, "fluffy", "ham, cheese, pineapple");
    }
}
