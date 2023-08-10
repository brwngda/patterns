package design_patterns.structural_patterns.Singleton.ExerciseFromCourse;

public class Machine {

    public int nextTicket() {
        return SingletonGenerator.INSTANCE.getNextTicket() + 200;
    }
}
