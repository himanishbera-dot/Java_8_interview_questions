package character;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseCharactersOfWords {
    public static void main(String[] args) {

        String input = "Java is a high-level, object-oriented programming language.";

        String output = Arrays.stream(input.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
