package oddAndEvenNumbersFromArray;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 5, 97, 32, 46 };

		System.out.println("Even Numbers");
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers");
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
