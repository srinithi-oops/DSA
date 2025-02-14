package DSA;

public class sum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        System.out.println(arrAddition(arr));
    }
    static int arrAddition(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        return sum;
    }
}
