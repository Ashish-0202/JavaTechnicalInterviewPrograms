package BasicQuestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner= new Scanner(System.in);

        int number= scanner.nextInt();
        boolean flag= true;
        if(number==1){
            flag=false;
        }else {
            for (int i=2;i< number/2;i++){
                if(number % i ==0){
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("Given number is a prime number..!");
        }else {
            System.out.println("Not a prime number");
        }
    }
}
