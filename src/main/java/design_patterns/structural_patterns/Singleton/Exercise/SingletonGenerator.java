package design_patterns.structural_patterns.Singleton.Exercise;

public enum SingletonGenerator {

    INSTANCE;

    private int nextTicket;

    public int getNextTicket() {
        return nextTicket++;
    }
}
