package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        String input = "Java is a high-level, object-oriented programming language.";

        Arrays.stream(input.split(" "))
                .collect(Collectors
                        .groupingBy(String::length, Collectors.toList()))
        .entrySet().forEach(System.out::println);
    }
}
