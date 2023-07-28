package design_patterns.structural_patterns.Pizza.AbstractMethod;


public class PizzaSalamiFactory {

    public static Pizza createPizza() {
        return new Pizza(50, "thin", "salami, cheese, mushrooms");
    }
}
