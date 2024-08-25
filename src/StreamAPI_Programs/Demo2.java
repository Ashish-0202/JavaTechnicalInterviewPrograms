package StreamAPI_Programs;

//Q: Filter only the passed students from the list
//Q: Add the grace marks to failed student
//Q: Count of failed students

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> marks= new ArrayList<>(Arrays.asList(12,34,55,90,84,58,21,29,9,76));

        List<Integer> passed= marks.stream()
                .filter(i -> i>35)
                .sorted()
                .toList();

        System.out.println("Passed Marks:"+passed);

        List<Integer> failed= marks.stream()
                .filter(i-> i<35)
                .map(i-> i+10)
                .sorted()
                .toList();

        System.out.println("Failed Marks:"+failed);

        long count= marks.stream()
                .filter(i-> i<35)
                .count();

        System.out.println("Failed Students:"+count);
    }
}
