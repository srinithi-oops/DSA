package DSA;

public class TwoDimentionalArrayMultiplication {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] result = TwoDimentionalarr(arr);
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

    }
    static int[][] TwoDimentionalarr(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] newArr = new int[rows][cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                newArr[row][col] = arr[row][col]*2;
            }
        }
        return newArr;
    }
}