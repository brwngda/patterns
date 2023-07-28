package design_patterns.structural_patterns.Pizza.AbstractMethod;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = PizzaSalamiFactory.createPizza();
        Pizza pizza1 = PizzaHawaiiFactory.createPizza();
    }
}
