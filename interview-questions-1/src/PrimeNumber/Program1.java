package PrimeNumber;

public class Program1 {

	public static void main(String[] args) {
		int number = 24;
		int temp = 0;
		for(int  i = 2 ; i<= number/2 ; i++) {
			if(number%i==0) {
				temp = temp + 1;
				break;
			}
		}
		
		if(temp == 0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}
	
}
