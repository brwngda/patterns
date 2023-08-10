package design_patterns.structural_patterns.Builder;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project patterns
 * @created 8/10/2023
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = Dog.builder()
                .name("Bella")
                .age(1)
                .type("Border collie")
                .build();
    }
}
