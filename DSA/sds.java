package DSA;

public class sds {
    public static void main(String args[]){
        int arr[][]={{1,2,3} ,{4,5,6}};
        int arr1[][]={{2,3,4},{5,6,7}};

        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i< row;i++){
            for(int j=0; j< col;j++){
                System.out.println(arr[i][j] + arr1[i][j] );
            }
        }


    }
}
