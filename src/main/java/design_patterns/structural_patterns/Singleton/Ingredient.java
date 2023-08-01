package design_patterns.structural_patterns.Singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Ingredient {
    private double price;

    public double getPrice() {
        return price * InflationCalculatorEager.INSTANCE.getInflationRate();
    }
}
