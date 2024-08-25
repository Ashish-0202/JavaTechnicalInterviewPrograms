package StreamAPI_Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

//Q: Find the employee with the second-highest salary

public class InterviewDemo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("DD-MM-YYYY");
        Date doj1= simpleDateFormat.parse("02-01-2002");
        Date doj2= simpleDateFormat.parse("29-10-2008");
        Date doj3= simpleDateFormat.parse("12-03-2020");
        Date doj4= simpleDateFormat.parse("19-09-2024");
        Date doj5= simpleDateFormat.parse("02-01-2023");

        List<employee> list= new ArrayList<>();

        list.add(new employee(110,"Ashish", doj1, 93000.0));
        list.add(new employee(102,"Vv9", doj2, 25000.0));
        list.add(new employee(101,"Akshay", doj3, 19000.0));
        list.add(new employee(104,"Holla", doj4, 29000.0));
        list.add(new employee(103,"Adith", doj5, 20000.0));
        employee e = list.stream()
                .sorted((b,a)-> Double.compare(a.getSalary(),b.getSalary()))
                .skip(1)
                .findFirst().get();

        System.out.println("Second highest salary: "+e);
    }
}
