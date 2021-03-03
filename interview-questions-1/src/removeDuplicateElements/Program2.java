package removeDuplicateElements;

import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {
		int arr[] = {5,7,8,5,9,22,43,21,22,7,6,9};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println();
		TreeSet<Integer> hashset = new TreeSet<Integer>();
		
		for(Integer i : arr) {
			hashset.add(i);
		}
		
		int size  = hashset.size();
		Integer array[] = new Integer[size];
		hashset.toArray(array);
		
		for(int i : array) {
			System.out.println(i);
		}
	}
	
}
