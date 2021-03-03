package searchElementInArray;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		int arr[] = { 45, 6, 7, 8, 23, 41, 78, 95, 106, 453, 236 };

		int value = 950;

		int result = binarySearch(arr,value);
		if(result==-1) {
			System.out.println("element not found in array");
		}else {
			System.out.println("position "+result);
		}
	}

	static int binarySearch(int[] arr, int value) {
		Arrays.sort(arr);

		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			int m = (l + h) / 2;
			
			if (arr[m] == value) {
				System.out.println("position at : " + m);
				return m;
			}

			if (arr[m] < value) {
				l = m + 1;
			}

			if (arr[m] > value) {
				h = m - 1;
			}
		}
		return -1;

	}

}
