package checkIfArraysAreEqual;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
			int arr1[] = {1,4,6,8};
			int arr2[] = {1,4,6,8};
			
			boolean flag = Arrays.equals(arr1, arr2);
			System.out.println(flag);
		}

}
