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


    public static void main(String[] args) {
        Student student = new Student("Kazik", "Kazimierczak", 30);
        try {
            Student studentClone = (Student) student.clone();
            studentClone.name = "Stasiek";
            System.out.println("Student: " + student);
            System.out.println("Student clone: " + studentClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
