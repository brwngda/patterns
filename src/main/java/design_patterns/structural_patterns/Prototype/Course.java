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
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Cloneable{
    private String subject;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
