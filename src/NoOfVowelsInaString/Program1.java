package NoOfVowelsInaString;

public class Program1 {
    public static void main(String[] args) {
        int count=0;
        String input="Hello World";

        input=input.toLowerCase();

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)=='a' || input.charAt(i)=='e' ||input.charAt(i)=='i' || input.charAt(i)=='o' ||input.charAt(i)=='u'){
                count++;
            }
        }

        System.out.println("Vowels in the given string:"+count);
    }
}
