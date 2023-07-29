package design_patterns.structural_patterns.Factory.Factory;


public class PizzaSalamiFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Pizza(50, "thin", "salami, cheese, mushrooms");
    }
}
