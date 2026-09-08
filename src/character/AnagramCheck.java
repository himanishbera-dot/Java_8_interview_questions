package character;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        String sorted1 = Arrays.stream(str1.split(""))
                .sorted()
                .collect(Collectors.joining());

        String sorted2 = Arrays.stream(str2.split(""))
                .sorted()
                .collect(Collectors.joining());

        boolean isAnagram = sorted1.equals(sorted2);
        System.out.println("Are anagrams? " + isAnagram); // Output: true
    }
}