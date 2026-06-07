package arrays;

import java.util.Arrays;
// 19-12-2025
public class PassingInFunction {
    public static void main(String[] args) {
int []num = {1,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));// after calling function
        // 0th index value change to 1 to 3
        // WHY -> because num pointing to object then arr which is in change function also pointing to same object
        // this is called mutable behaviour change in object
        // NOT STRING is immutable the above behaviour not
    }
    static void change(int []arr){
        arr[0] = 99;
    }
}
