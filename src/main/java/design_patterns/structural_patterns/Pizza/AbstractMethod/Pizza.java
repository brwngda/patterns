package design_patterns.structural_patterns.Pizza.AbstractMethod;

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
}