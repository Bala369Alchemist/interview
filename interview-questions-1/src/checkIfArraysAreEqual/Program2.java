package checkIfArraysAreEqual;

public class Program2 {

	public static void main(String[] args) {
		int arr1[] = { 2, 6, 9, 4 };
		int arr2[] = { 2, 6, 9, 4 };

		boolean status = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					status = false;
					break;
				}
			}
		} else {
			status = false;
		}
		
		if(status == true) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}

}
