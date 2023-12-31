package design_patterns.structural_patterns.Singleton;

public class Main {
    public static void main(String[] args) {

        // Eager
        double InflationRateEager = InflationCalculatorEager.INSTANCE.getInflationRate();

        // Lazy
        double inflationRateLazy = InflationCalculatorLazy.getInstance().getInflationRate();

        // Enumerated
        double inflationRateEnumerated = InflationCalculatorEnumerated.INSTANCE.getInflationRate();
    }
}
