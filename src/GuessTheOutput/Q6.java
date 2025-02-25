package GuessTheOutput;


public class Q6 {

    String name;

    public Q6(){
        this.name="Default name";
    }

    public Q6(String name){
        this.name=name;
    }
    public static void main(String[] args){
        //Q6 q6 = new Q6("My Name");
        Q6 q6 = new Q6();
        System.out.printf(q6.name);
    }
}
