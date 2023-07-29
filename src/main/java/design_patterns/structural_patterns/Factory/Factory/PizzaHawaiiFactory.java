package design_patterns.structural_patterns.Factory.Factory;


public class PizzaHawaiiFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Pizza(30, "fluffy", "ham, cheese, pineapple");
    }
}
