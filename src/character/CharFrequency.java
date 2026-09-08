package character;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the Occurrences of Each Character
public class CharFrequency {
    public static void main(String[] args) {
        String input = "interview";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);
        // Output: {r=1, e=2, t=1, v=1, i=2, w=1, n=1}
    }
}
