package design_patterns.structural_patterns.Factory.FactoryMethod;

import lombok.Data;

@Data
public class Pizza {
    private double size;
    private String dough;
    private String ingredients;

    Pizza(double size, String dough, String ingredients) {
        this.size = size;
        this.dough = dough;
        this.ingredients = ingredients;
    }

    public static Pizza createPizzaSalami() {
        return new Pizza(50, "thin", "salami, cheese, mushrooms");
    }

    public static Pizza createPizzaHawaii() {
        return new Pizza(30, "fluffy", "ham, cheese, pineapple");
    }
}