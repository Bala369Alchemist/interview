package sumOfElementsOfArray;

public class Program1 {

	public static void main(String[] args) {
		int[] array = {5,21,7,3,8};
		int sum = 0;
		for(int i=0 ; i<array.length;i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);
	}
	
}
