package strings;

public class Sb {
    // STRING BUILDER it is mutable and we can edit does not create an multiple object like string mentioned in performance class
   // so it will change the original value
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
