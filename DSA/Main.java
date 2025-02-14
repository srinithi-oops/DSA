package DSA;

public class Main
{
	public static void main(String[] args) {
	    int arr[] = {2,3,4,5,6};
	    System.out.println(arrAddition(arr));
	}
	static int arrAddition(int[] arr){
	    int product=1;
	    for(int index = 0 ; index<arr.length ; index++){
	        product *=arr[index];
	    }
	    return product ;
	}
}