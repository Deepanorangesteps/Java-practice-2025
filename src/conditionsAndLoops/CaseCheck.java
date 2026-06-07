package conditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n  = input.nextInt();
     //   String ch = input.next();
//        if(ch.charAt(0) >='a' && ch.charAt(0)<='z'){
//            System.out.println("Lowercase");
//        }else {
//            System.out.println("Upper case");
//        }
        int b=0;
        int fibo = 0;
        for (int i =0; i<=n;i++){
            fibo = i+b;
            b= i;
        }
        System.out.println(fibo);
    }
}
