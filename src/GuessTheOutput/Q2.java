package GuessTheOutput;

//Based on switch statement

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Executing loop");

        outerLoop:
        for(int i=0;i<2;i++){
            for (int j=0;j<10;j++){
                System.out.println(i+""+j);
                if(j==5){
                    break outerLoop;
                }
            }
        }
    }
}
