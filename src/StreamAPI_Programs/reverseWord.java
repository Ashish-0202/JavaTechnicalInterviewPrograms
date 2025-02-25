package StreamAPI_Programs;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseWord {
    public static void main(String[] args) {
        String input ="Hello Java World";

        String result = Stream.of(input.split(" "))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
