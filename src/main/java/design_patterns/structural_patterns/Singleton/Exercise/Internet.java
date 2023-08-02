package design_patterns.structural_patterns.Singleton.Exercise;

public class Internet {

    public int nextTicket() {
        return SingletonGenerator.INSTANCE.getNextTicket();
    }
}
