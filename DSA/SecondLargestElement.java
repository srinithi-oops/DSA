package DSA;

public class SecondLargestElement {
    public static void main(String[] args) {

    }
    static int secondlargestElemt(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j>0 ; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        return arr.length - 1;
    }
}
