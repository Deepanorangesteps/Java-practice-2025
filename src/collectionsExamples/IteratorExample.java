package collectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D"); // 👈 important

        for (String s : list) {
            if (s.equals("B")) {
                list.remove(s); // 💥 Now CME will occur
            }
        }
    }
}
