package conditionsAndLoops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maxValue = 0;
// find the largest number among three numbers
//        if(a>b){
//            maxValue = a;
//        } else if (b>a) {
//            maxValue = b;
//        }
//        if (c > maxValue){
//            maxValue = c;
//        }
//        System.out.println("maximum value "+maxValue);

        // find the maximum using the math function

        int max = Math.max(c,Math.max(a,b));
        System.out.println("Maximum value is "+max);

    }
}
