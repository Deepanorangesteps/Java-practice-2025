package strings;

import java.text.DecimalFormat;
import java.util.Arrays;

//09-02-2026 STRING BUFFER
public class Sf {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor 2
        StringBuffer sb2 = new StringBuffer("Alex");

        // constructor 3
        StringBuffer sb3 = new StringBuffer(30);// this is capacity basically default capacity is 16
        // it works like array list means while adding it double the size here we can declare the size as well

    sb.append("we make devs");
    sb.append("nice");
    sb.indexOf("5",2);
    String str = sb.toString();
        System.out.println(str);

        String name = RandomStrings.generate(20);// generating a random string using the string buffer
        System.out.println("Name "+name);

        String sentence = "Hii i am Alex";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        String arr = "Alex Andrew Micheal";
        String [] names = arr.split(" ");
        System.out.println(Arrays.toString(names));
// rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(70.2));

    }
}
