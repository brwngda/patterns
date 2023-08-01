package design_patterns.structural_patterns.Singleton;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Product {
    private List<Ingredient> ingredientList;
    private double profit;

    public void addIngredient() {
        ingredientList.add(new Ingredient(2.50));
    }

    public double returnPrice() {
        return ingredientList.stream().mapToDouble(value -> value.getPrice()).sum() + (profit * InflationCalculator.INSTANCE.getInflationRate());
    }

}
