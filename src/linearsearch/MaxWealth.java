package linearsearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {5,6,3},
                {1,2,3}
        };
        System.out.println(findMaxWealth(arr));
    }
    static int findMaxWealth(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int row =0; row<arr.length;row++){
            int rowTotal = 0;
            for (int col = 0; col<arr[row].length;col++){
                rowTotal+= arr[row][col];
            }
            if(rowTotal >max){
                max = rowTotal;
            }
        }
        return max;
    }
}
