package design_patterns.structural_patterns.Singleton;

public enum InflationCalculatorEnumerated {
    INSTANCE;

    public double getInflationRate() {
        return 20.0;
    }
}
