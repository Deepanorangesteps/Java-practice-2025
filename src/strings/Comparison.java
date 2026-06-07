package strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "alex";
        String b = "alex";
        System.out.println(a == b);// stored in string pool pointing to the same object

        String name1 = new String("Alex");
        String name2 = new String("alex");
        System.out.println(name1 == name2); // pointing to different object because we created new ones
        System.out.println(name1.equalsIgnoreCase(name2));
    }

}
