package minAndMax;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = {16,34,8,9,21,7};
		
		//minimum element
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		
		//maximun element
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
	}

}
