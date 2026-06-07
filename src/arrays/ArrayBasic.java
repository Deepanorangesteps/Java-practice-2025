package arrays;

import java.util.Scanner;

// 18-12-2025 array definition and basics
public class ArrayBasic {
    /*
    *int [] rollNo declaration : during compile time
    * new int[5] initializing :during run time, creating the object in the heap memory
    *so this is  DYNAMIC MEMORY ALLOCATION means memory created during runtime
    * */
    public static void main(String[] args) {
        /*int []arr = new int[5];
        System.out.println(arr[0]);
        so arr is an empty array and i try to print a[0] the output is 0
        why ? by default after creating a array object it declared like 0,0,0,0,0 so it comes 0
         String[]strAr = new String[2];
         System.out.println(strAr[0]);
         for string array comes as null
         */

// NULL IS LITERAL null cannot assign to primitive data type assign only non primitive
        // NULL IS BY DEFAULT value of reference variable for ex int[]arr; this is null like that

   int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < args.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int n:
             arr) {// for every element in the array, print the element
            System.out.println(n);// here n represent the element of the array
        }

    }
}
