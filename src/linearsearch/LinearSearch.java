package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,7,8};
        System.out.println(linearSearch(arr,90));
    }
    static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}
