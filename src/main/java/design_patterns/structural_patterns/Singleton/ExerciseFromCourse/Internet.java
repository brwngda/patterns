package design_patterns.structural_patterns.Singleton.ExerciseFromCourse;

public class Internet {

    public int nextTicket() {
        return SingletonGenerator.INSTANCE.getNextTicket();
    }
}
