package StreamAPI_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfFirstThreeEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result= numbers.stream()
                .filter(n -> n % 2 ==0)
                .limit(3)
                .map(n -> n * n)
                .toList();

        System.out.println(result);
    }
}
