package number;
import java.util.Arrays;
import java.util.List;



public class NumbersStartingWith1 {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        myList.stream().filter(x -> (x-(x % 10))/10 == 1)
                .forEach(System.out::println);

    }
}
