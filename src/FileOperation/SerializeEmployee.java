package FileOperation;

import java.io.*;

public class SerializeEmployee {
    public static void main(String[] args) {
        System.out.println("Serializing employee object++");

        Employee employee = new Employee("Ashish","Ash2002");

        try(BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(new FileOutputStream("employee.ser"))){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
            objectOutputStream.writeObject(employee);
            System.out.println("Employee Object Serialized");
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
