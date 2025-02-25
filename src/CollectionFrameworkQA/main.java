package CollectionFrameworkQA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student(3,"Ashish"));
        students.add(new student(2,"Ashwini"));
        students.add(new student(1,"Anil"));

        Collections.sort(students,new nameOrder());

        System.out.println(students);
    }
}
