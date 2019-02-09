package pl.sda.jsonmapperParent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.lambda.Movie;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Tytul",
                        "Jan",
                        60,
                        Arrays.asList("Jan", "Maciek")),
                new Movie("Tytul2",
                        "Kamil",
                        33,
                        Arrays.asList("Jan", "Maciek")),
                new Movie("Tytul3",
                        "Jan",
                        20,
                        Arrays.asList("Michal", "Maciek"))
        );

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("movies.json");
        try {
            mapper.writeValue(file,movies);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Movie[] movies1 = mapper.readValue(file, Movie[].class);
            for(Movie m : movies1) {
                System.out.println(m);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
