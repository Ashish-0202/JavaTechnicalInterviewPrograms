package GuessTheOutput;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        tokenize("ab;bf;dc;s",";");
    }

    private static void tokenize(String string,String regex){
        String[] tokens = string.split(regex);
        System.out.println(Arrays.toString(tokens));
    }
}
