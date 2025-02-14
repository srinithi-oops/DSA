package DSA;

public class TotalSumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(totalSum(arr));
    }
    static int totalSum(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int sum=0;
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                sum += arr[row][col];
            }
        }
        return sum;
    }
}
