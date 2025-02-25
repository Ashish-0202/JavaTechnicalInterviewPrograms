package InterestingTopics;

//Variable argument allows us to pass any number of arguments while calling a method

public class VariableArguments {
    public static void main(String[] args) {
        VariableArguments arguments = new VariableArguments();
        int sum=arguments.sum(3,5,6,8);
        System.out.println("Sum of arguments: "+sum);
    }

    public int sum(int... numbers){
        int sum=0;

        for(int number: numbers){
            sum+=number;
        }
        return sum;
    }
}
