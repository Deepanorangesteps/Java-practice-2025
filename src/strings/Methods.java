package strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name  ="hello world I am ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('l'));
        System.out.println("    Heooll    ".strip());// remove the space 
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
