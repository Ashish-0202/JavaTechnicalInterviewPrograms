package InterestingTopics;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindingAgeOfPerson {
    public static void main(String[] args) {
        //Getting use input
        System.out.println("Enter your age (YYYY-MM-DD):");

        try(Scanner scanner= new Scanner(System.in)){
            String date = scanner.nextLine();

            //convert into LocalDate
            LocalDate birthDate= LocalDate.parse(date);

            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthDate,currentDate);

            System.out.println("Your Current Age: "+age.getYears());
        }
    }
}
