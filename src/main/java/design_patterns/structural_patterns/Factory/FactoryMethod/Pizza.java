package design_patterns.structural_patterns.Factory.FactoryMethod;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Pizza {
    private double size;
    private String dough;
    private List<String> ingredients;

    public Pizza(double size, String dough, List<String> ingredients) {
        this.size = size;
        this.dough = dough;
        this.ingredients = ingredients;
    }



    public static Pizza createPizzaSalami() {
        return new Pizza(50, "thin", Arrays.asList("salami", "cheese", "mushrooms"));
    }

    public static Pizza createPizzaHawaii() {
        return new Pizza(30, "fluffy", Arrays.asList("ham", "cheese", "pineapple"));
    }
}