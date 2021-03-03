package FibonacciSeries;

public class Program1 {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		
		int count = 10;
		int sum = 0;
		for(int i = 2 ; i<count;i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}
	}
	
}
