package duplicateElementInArray;

public class Program1 {

	public static void main(String[] args) {
		String[] array = {"cat","dog","mouse","monkey","bear","cat"};
		
		boolean flag = false;
		
		for(int i = 0 ; i<array.length ; i++) {
			for(int j = i+1 ; j<array.length ; j++) {
				if(array[i]==array[j]) {
					flag = true;
					break;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("No duplicate element");
		}else {
			System.out.println("Duplicate element");
		}
		

	}
	
}
