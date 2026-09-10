package number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
        Set<Integer> numberSet = new HashSet<Integer>();

        myList.stream().filter(x -> !numberSet.add(x))
                .forEach(System.out::println);
    }
}
