package countNumberOfDigit;

public class Program1 {

	public static void main(String[] args) {
		int num = 3456789;
		int count = 0 ;
		while(num > 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

}
