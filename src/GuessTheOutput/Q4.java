package GuessTheOutput;

//Local variable must be initialized or else it will throw compilation error

//The Default value of static variable will be 0 but initial no need to initialize the variable

//The Default value of instance variable will be 0

public class Q4 {

    static int sid;

    int id;

    public static void main(String[] args) {
        System.out.println("Default value of static/global variable="+sid);
        Q4 q = new Q4();
        System.out.println("Default value of instance variable="+q.id);
        String name = null;
        System.out.println(name);
        //int j;
        int i=0;
        System.out.println(i);
    }
}
