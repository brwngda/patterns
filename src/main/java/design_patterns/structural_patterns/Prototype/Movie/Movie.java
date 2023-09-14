package design_patterns.structural_patterns.Prototype.Movie;

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
public class Movie implements Cloneable {
    private String title;
    private int yearOfRelease;
    Genre genre;
    Cast cast;

    public static void main(String[] args) {
        Movie movie = new Movie("Borat", 2006, Genre.COMEDY, new Cast("Sacha Baron Cohen"));
        try {
            Movie movieClone = (Movie) movie.clone();
            System.out.println("Movie : " + movie);
            System.out.println("Movie clone : " + movieClone);
            movieClone.yearOfRelease = 2007;
            movieClone.genre = Genre.DRAMA;
            movieClone.cast.setTopStar("Goat");
            System.out.println("############## after change");
            System.out.println("Movie : " + movie);
            System.out.println("Movie clone : " + movieClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
