package BasicQuestions;

//Q: Default values of instance, local and static variable

//Note instance variable needs to be assigned with 0 or else it will through compilation error
public class Q1 {
    int j;
    //Instance variables will be 0 by default

    static int l;
    //Static variables will be null by default and it belongs to the class rather than instance of class

    public static void main(String[] args) {
        int i=0;
        System.out.println("---------Local variable------");
        System.out.println(i);
        System.out.println("---------Instance variable------");
        Q1 q1=new Q1();
        System.out.println(q1.j);
        System.out.println("---------Static variable------");
        System.out.println(l);
    }
}
