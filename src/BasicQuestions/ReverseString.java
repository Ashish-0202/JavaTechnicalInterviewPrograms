package BasicQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner= new Scanner(System.in);

        String input= scanner.next();

        //StringBuilder result = new StringBuilder();

        String result = "";

        if (input.isEmpty() || input.isBlank()){
            System.out.println("String is empty..!");
        }else {
            for (int i= input.length()-1;i>=0;i--){
                result += input.charAt(i);
            }
        }

        System.out.println("Reversed String:"+result);

    }
}
