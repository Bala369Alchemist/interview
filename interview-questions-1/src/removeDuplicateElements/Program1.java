package removeDuplicateElements;

import java.util.LinkedHashSet;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = {5,7,8,9,3,6,8,5};
		for(Integer i : arr) {
			System.out.println(i);
		}
		System.out.println();
		LinkedHashSet<Integer> hashset = new LinkedHashSet<Integer>();
		
		for(Integer i : arr) {
			hashset.add(i);
		}
		
		int size = hashset.size();
		
		Integer[] array = new Integer[size];
		hashset.toArray(array);
		for(int i : array) {
		System.out.println(i);
		}
	}
	
}
