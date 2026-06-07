package strings;

import java.util.Random;

// 09-02-2026 creating a random string using the string buffer
public class RandomStrings {

    static String generate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
int randomChar = 97+(int) (random.nextFloat()*26);
sb.append((char) (randomChar));
        }
        return sb.toString();
    }
}
