package design_patterns.structural_patterns.Singleton;

public class InflationCalculatorLazy {
    private static InflationCalculatorLazy INSTANCE;

    public static InflationCalculatorLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new InflationCalculatorLazy();
        }
        return INSTANCE;
    }

    public double getInflationRate() {
        return 20.00;
    }
}
