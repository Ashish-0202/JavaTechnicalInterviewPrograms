package StreamAPI_Programs;

/* Q: Find the employee with the highest salary */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class InterviewDemo1 {
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

        employee emp=  list.stream()
                .max((a,b)-> Double.compare(a.getSalary(),b.getSalary())).get();

        System.out.println(emp);
    }
}
