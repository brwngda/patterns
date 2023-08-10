package design_patterns.structural_patterns.Singleton.ExerciseFromCourse;

public enum SingletonGenerator {

    INSTANCE;

    private int nextTicket;

    public int getNextTicket() {
        return nextTicket++;
    }
}
