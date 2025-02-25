package GuessTheOutput;

//The Initial value of static variable will be its least null value as per the data type, default can be 0/null

//The Initial value of global/instance variable will be its least null value as per the data type, default can be 0/null

//Local variable cannot be null/0 by default, we have to initialize before we use

//The final variable cannot be null, should be initialized at the time of declaration
public class Q7 {
    String a;
    //final int m; //COMPILATION ERROR
    static double i;
    public static void main(String[] args) {
        String b;
        Q7 q7 = new Q7();
        System.out.println(i);
        System.out.println("a:"+q7.a);
        //System.out.println("b:"+b); //COMPILATION ERROR
    }
}
