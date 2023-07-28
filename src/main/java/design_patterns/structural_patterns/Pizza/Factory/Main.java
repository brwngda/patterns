package design_patterns.structural_patterns.Pizza.Factory;


public class Main {
    public static void main(String[] args) {
        PizzaSalamiFactory pizzaSalamiFactory = new PizzaSalamiFactory();
        Pizza pizza1 = pizzaSalamiFactory.createPizza();
        PizzaHawaiiFactory pizzaHawaiiFactory = new PizzaHawaiiFactory();
        Pizza pizza2 = pizzaHawaiiFactory.createPizza();
    }
}