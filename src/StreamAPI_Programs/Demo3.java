package StreamAPI_Programs;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(34,11,2,34,12,45,66,22,90,10));

        //Q: To sort in custom order method one
        List<Integer> newlist=  list.stream()
                .sorted((a,b)-> (a<b)?1:(a>b)?-1:0)
                .toList();

        System.out.println(newlist);

        //Q: Method two using Comparable
        List<Integer> newlist2= list.stream()
                .sorted((a,b)-> b.compareTo(a))
                .toList();

        System.out.println(newlist2);

        //Q: Method 3
        List<Integer> newlist3= list.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(newlist3);

        //Q:Method 4 using comparator

        List<Integer> newlist4= list.stream().sorted((a,b)-> Integer.compare(b,a)).toList();

        Optional<Integer> maxx= list.stream().max((a, b)-> Integer.compare(b,a));
        Optional<Integer> minn= list.stream().min(((a,b)-> Integer.compare(b,a)));
        System.out.println(minn);
        System.out.println(maxx);

        System.out.println(newlist4);
    }
}
