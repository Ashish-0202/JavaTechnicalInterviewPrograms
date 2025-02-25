package InterestingTopics;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializeObject implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("UserInfo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        SerializeObject object = (SerializeObject) objectInputStream.readObject();
        System.out.println("Reading object");
        System.out.println(object.id);
        System.out.println(object.username);
        System.out.println(object.password);
    }
}
