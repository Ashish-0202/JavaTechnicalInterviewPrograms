package FileOperation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
    public static void main(String[] args) {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("employee.ser"))) {
            ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
            Employee employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
