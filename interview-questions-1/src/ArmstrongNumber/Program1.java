package ArmstrongNumber;

public class Program1 {

	public static void main(String[] args) {
		int number = 153;
		int rem = 0 ;
		int result = 0;
		int temp = number;
		
		while(number > 0) {
			rem = number % 10;
			number = number / 10;
			result = result + (rem*rem*rem);
		}
		
		if(temp == result) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
	
}
