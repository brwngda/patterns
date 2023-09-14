package design_patterns.structural_patterns.Prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project patterns
 * @created 9/14/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Cloneable {
    private String name;
    private String lastName;
    private int age;
    private Course course;


    public static void main(String[] args) {
        Student student = new Student("Kazik", "Kazimierczak", 30, new Course("Biology"));
        try {
            Student studentClone = (Student) student.clone();
            System.out.println("Student: " + student);
            System.out.println("Student clone: " + studentClone);
            studentClone.name = "Stasiek";
            studentClone.course.setSubject("History");
            System.out.println("############## after change");
            System.out.println("Student: " + student);
            System.out.println("Student clone: " + studentClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
