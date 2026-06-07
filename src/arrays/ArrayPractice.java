package arrays;

import java.util.Arrays;
// 04-01-2026 array basics like reverse swapping
public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8};
       // System.out.println(Arrays.toString(arr));
      //  swap(arr,1,3);
      //  System.out.println(Arrays.toString(arr));
      //  System.out.println(max(arr));
      //  System.out.println(maxRange(arr,0,2));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        // time complexity is how the time grows based upon the input
    }
    static void reverse(int[]arr){
        int start=0;
        int end = arr.length -1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int []arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[]arr){
        int max = arr[0];
        for (int i=1;i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for (int i=start ;i<=end;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
