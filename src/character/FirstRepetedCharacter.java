package character;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Find the First Non-Repeated (Unique) Character*/
public class FirstRepetedCharacter {
    public static void main(String[] args) {
        String input = "sswiss";

        Set<Character> set = new HashSet<Character>();
        Optional<Character> firstRepeted = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c->!set.add(c) )
                .findFirst();

        firstRepeted.ifPresent(System.out::println); // Output: w
    }
}
