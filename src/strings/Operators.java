package strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');// internally it convert into hashcare value gives 195
        System.out.println("a"+"b"); // here it only concodinate
        System.out.println((char) ('a'+3));

        System.out.println(3+5+'c'+"A"+5);

        // basically in java + only do the operator overloading means it should helps to
        // concodinate the string
        // for ex here we can't print  System.out.println(new Integer(54)+new ArrayList<>()); must use string
    }
}
