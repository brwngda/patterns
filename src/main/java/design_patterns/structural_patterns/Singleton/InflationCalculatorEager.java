package design_patterns.structural_patterns.Singleton;

public class InflationCalculatorEager {
    public static InflationCalculatorEager INSTANCE = new InflationCalculatorEager();

    public double getInflationRate() {
        return 20.0;
    }
}
