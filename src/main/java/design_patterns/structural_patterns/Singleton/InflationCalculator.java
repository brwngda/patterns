package design_patterns.structural_patterns.Singleton;

public class InflationCalculator {
    public static InflationCalculator INSTANCE = new InflationCalculator();

    public double getInflationRate() {
        return 20.0;
    }
}
