package missingNumber;

import java.util.Arrays;

public class Program1 {

	static int getMissingNumber(int[] arr) {
		int n = arr.length;
		int m = n+1;
		int total = m*(m+1)/2;
		int sum = Arrays.stream(arr).sum();
		return total - sum;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		System.out.println("Missing Element is "+getMissingNumber(arr));
	}
	
}
