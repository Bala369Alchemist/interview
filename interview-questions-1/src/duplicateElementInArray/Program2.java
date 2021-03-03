package duplicateElementInArray;

import java.util.HashSet;

public class Program2 {

	public static void main(String[] args) {
		String[] array = {"cat","dog","mouse","monkey","bear","cat"};
		
		boolean flag = false;;
		
		HashSet<String> animals = new HashSet<String>();
		for(String s : array) {
			if(animals.add(s)==false) {
				flag = true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("No duplicate element");
		}else {
			System.out.println("Duplicate element present");
		}
		
	}

}
