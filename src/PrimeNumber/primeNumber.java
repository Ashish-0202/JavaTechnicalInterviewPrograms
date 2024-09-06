package PrimeNumber;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");

        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();

        boolean flag=true;

        if (n==1 || n<1){
            flag=false;
        } else {

            for (int i=2;i< n/2;i++){
                if (n%i==0){
                    flag=false;
                }
            }
        }


    }
}
