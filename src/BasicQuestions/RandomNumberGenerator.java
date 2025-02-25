package BasicQuestions;

import java.security.SecureRandom;
import java.util.Random;

public class RandomNumberGenerator {

    public static int generateNumber(){
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }

    public static int generateSecureNumber(){
        SecureRandom random = new SecureRandom();
        return 1000 + random.nextInt(9000);
    }

    public static void main(String[] args) {
        int randomNumber = generateNumber();
        System.out.println(randomNumber);
        int secure = generateSecureNumber();
        System.out.println(secure);
    }
}
