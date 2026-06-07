package strings;
// 09-02-2026 so here we are see the performance of the string
public class Performance {
    public static void main(String[] args) {
        String series= "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i); // here we are casting and append the char upto z
            series = series+ch; // here we are concatenate the char to the series
            // ISSUE IS CREATING AN  OBJECT EVERY TIME 26NEW OBJECT CREATED IT IS WASTE OF SPACE TIME COMPLEXITY IS VERY WORST O(N2)
            // so here STRING BUILDER WILL COME this is mutable will change the original object does not create a new one
        }
        System.out.println(series);
    }
}
