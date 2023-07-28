package design_patterns.structural_patterns.Pizza.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = Pizza.createPizzaHawaii();
        Pizza pizza2 = Pizza.createPizzaSalami();
    }
}
