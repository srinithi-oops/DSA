package DSA;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        System.out.println(largestElement(arr,4));
    }

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int index = 0 ; index <= n ; index++){
            if(max<arr[index]){
                int temp = max;
                max =arr[index];
                arr[index] = temp;
            }
        }
        return max;
    }
}
