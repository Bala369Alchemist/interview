package searchElementInArray;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int arr[] = {34,56,2,7,8,90,38,55};
		Arrays.sort(arr);
		
		int key  = 34;
		
		boolean flag = false;
		
		int l = 0;
		int h = arr.length - 1;
		
		while(l<=h) {
			int m = (l+h)/2;
			
			if(arr[m]==key) {
				System.out.println("position : "+m);
				flag = true;
				break;
			}
			
			if(arr[m]<key) {
				l = m+1;
			}
			
			if(arr[m]>key) {
				h = m-1;
			}
			
		}
		if(flag == false) {
			System.out.println("element not present in array");
		}
		
	}

}
