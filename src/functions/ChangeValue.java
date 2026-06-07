package functions;

import java.util.Arrays;

// 16-12-2025
public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        changingValue(arr); // here we change the value of this parent array so it will change
        /*EXPLANation ARR AND num are pointing to the same object so if we change the value in num
        * present in changigvalue function it will change the origin of the object arr
        * this could not happen in STRING because it is final nd immutable */
        System.out.println(Arrays.toString(arr));
    }
    static  void changingValue(int []num){
        num[0] = 99; // if you make the change of this object via this ref variable
                      // origin object will change
         }
}
