package pl.sda.programowanieI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // (int a, int b) -> a + b;

        //interfejs funkcyjny
        AddInterface add = (a, b) -> a + b;
        add.calc(4, 2);

//        AddInterface add2 = new AddInterface() {
//            @Override
//            public int calc(int a, int b) {
//                return a + b;
//            }
//        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for (Integer integer : numbers) {
            System.out.println(integer);
        }

        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);


        numbers.forEach(System.out::println);

        List<Movie> movies = Arrays.asList(
                new Movie("tytuł",
                        "Jan",
                        LocalDate.of(2012, 02, 12), 60,
                        Arrays.asList("Michał", "Michał", "Maciek")),
                new Movie("tytuł2", "Piotr", LocalDate.of(2012, 02, 12),
                        40, Arrays.asList("Michał", "Michał", "Maciek")
                ));

        List<String> titles = movies
                .stream()
                .map(f -> f.getTitle()) // wskazuje to co chce zabrac
                .collect(Collectors.toList()); // tworze liste z tytulami

        List<String> directors = movies
                .stream()
                .map(f -> f.getDirector())
                .collect(Collectors.toList());

        System.out.println(titles);
        System.out.println(directors);
        for (String d : directors) {
            System.out.println(d);
        }

        titles.forEach(System.out::println);

        List<Movie> movieList = movies.stream()
                .filter(f -> f.getPrice() > 50)
                .collect(Collectors.toList());
    }


}
