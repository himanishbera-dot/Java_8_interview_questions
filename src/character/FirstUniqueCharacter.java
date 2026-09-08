package character;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Find the First Non-Repeated (Unique) Character*/
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> firstUnique = input.chars()
                .mapToObj(c -> (char) c)
                // Use LinkedHashMap to preserve the original insertion order
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstUnique.ifPresent(System.out::println); // Output: w
    }
}
