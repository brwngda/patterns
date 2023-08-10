package design_patterns.structural_patterns.Builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project patterns
 * @created 8/10/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

}
