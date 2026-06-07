package binarysearch;
// 05-01-2026 binary search and notes will be available in note
public class BinarySearch {
    // NOTE - > Binary search will only works in sorted array
    public static void main(String[] args) {
        int[]arr = {-2,10,20,43,56,65,78,87,90,105,159};
        int target = 789;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <=end){
            int mid = start +(end-start)/2;
            if(target < arr[mid]){
                end =mid-1;
            } else if (target> arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
