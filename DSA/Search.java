package DSA;

public class Search{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,7};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        for(int index=0 ; index<arr.length ; index++){
            if(arr[index]== target){
                return index;
            }
        }
        return -1;
    }
}