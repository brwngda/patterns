package design_patterns.structural_patterns.Factory.Factory;

import lombok.Data;

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
}