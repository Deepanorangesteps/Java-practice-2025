package arrays;
//19-12-2025 2d and multi dimension array
public class MultiDimensionArray { 
    public static void main(String[] args) {

        int[][] arr = new int[3][]; // here column is not mandatory
        int [][] ar2d = {
                {1,2},
                {3,4,5},
                {7,8,9,10}
        };

        for (int row =0; row < ar2d.length ; row++){
            for (int col = 0; col <ar2d[row].length;col++){
                System.out.print(ar2d[row][col]+" ");
            }
            System.out.println();
        }
    }
}
