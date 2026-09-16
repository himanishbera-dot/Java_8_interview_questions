package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {

        String input = "Java is a high-level, object oriented programming language.";

        List<String> list1 = Arrays.asList(input.split(" "));
        Collections.reverse(list1);

         String output = list1.stream().collect(Collectors.joining(" "));

        System.out.println(output);
    }
}
