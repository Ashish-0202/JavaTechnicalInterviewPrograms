package BasicQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= scanner.nextInt();

        int result =0;
        while (n>0){
            int rem = n%10;
            result = result*10 + rem;
            n=n/10;
        }

        System.out.println(result);
    }
}
