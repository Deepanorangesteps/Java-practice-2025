package binarysearch;

import java.util.Arrays;

public class RowColMatrix {


    public static void main(String[] args) {
        int[][]arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c =matrix.length-1;
        while (r< matrix.length && c>=0){
            int currElement = matrix[r][c];
            if(currElement == target){
                return new int[]{r,c};
            }
            if(currElement <target){
                r++;
            }else {
                c--;
            }
        }
        return  new int[]{-1,-1};
    }
}
