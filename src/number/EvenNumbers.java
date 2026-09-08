package number;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        System.out.println("Even numbers are :-");
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Odd numbers are :-");
        list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
    }
}
