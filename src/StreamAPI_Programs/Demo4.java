package StreamAPI_Programs;

//Q: Convert the given array into stream objects and apply the filter and map function

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        Integer[] i ={99,34,12,33,65,66,88,5,100,1};

        //way1: We can use Arrays class
        Arrays.stream(i).
                filter(n-> n%2==0)
                .map(n-> n*2)
                .sorted()
                .forEach(System.out::println);

        //way2: we can use stream.of() method


    }
}
