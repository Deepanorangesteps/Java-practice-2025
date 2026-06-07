package linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]arr = {
                {1,2,3,4},
                {90,87,65,4},
                {78,54,23}
        };
        //System.out.println(Arrays.toString(search3(arr,90)));
        System.out.println(max(arr));
    }
    static int max(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    static int[] search3(int[][]arr,int target){
        for (int row =0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int search2(int[][]arr,int target){
        for (int row =0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if(target == arr[row][col]){
                    return target;
                }
            }
        }
        return -1;
    }
    static int search(int[][]arr,int target){
        for (int[] sera:
             arr) {
            for (int i:
                 sera) {
                if(target == i){
                    return target;

                }
            }
        }
        return -1;
    }
}
