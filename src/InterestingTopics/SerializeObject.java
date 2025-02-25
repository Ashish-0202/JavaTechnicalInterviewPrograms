package InterestingTopics;

import java.io.*;

public class SerializeObject implements Serializable {

    public SerializeObject(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    int id;
    String username;
    transient String password;

    public static void main(String[] args) throws IOException {

        FileOutputStream outputStream = new FileOutputStream("UserInfo.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(new SerializeObject(1,"Ashish","Ash2002"));
        objectOutputStream.close();
        System.out.println("Object serialized successfully.");

    }
}
