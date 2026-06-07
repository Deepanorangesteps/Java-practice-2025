package binarysearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {5,6,79,90,123,190};
        int []arr2 = {190,176,250,100,45,23,0,-10};
        int target  = 79;
       int ans =  orderAgnosticBinarySearch(arr,target);
        System.out.println("Answer is "+ans);
    }
    static int orderAgnosticBinarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            boolean isAsc= arr[start] < arr[end];
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target <arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }else {
                if (target > mid){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
