package searchElementInArray;

public class Program1 {

	public static void main(String[] args) {
		int[] array = {4,6,8,2,56,45,34,78,65,33};
		int value = 341;
		boolean flag = false;
		for(int i = 0 ; i< array.length ; i++ ) {
			if(array[i]==value) {
				System.out.println("Value "+value+" found at position : "+i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Value not present in the array");
		}
	}

}
