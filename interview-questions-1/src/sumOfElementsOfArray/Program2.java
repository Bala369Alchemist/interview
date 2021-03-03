package sumOfElementsOfArray;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int arr[] = {5,21,7,3,8};
		int sum  = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
	
}
