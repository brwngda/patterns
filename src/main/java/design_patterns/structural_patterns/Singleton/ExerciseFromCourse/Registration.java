package design_patterns.structural_patterns.Singleton.ExerciseFromCourse;

public class Registration {


    public int nextTicket() {
        return SingletonGenerator.INSTANCE.getNextTicket() + 600;
    }
}
