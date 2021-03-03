package ArmstrongNumber;

public class Program2 {

	public static void main(String[] args) {

		int number = 153;
		int rem = 0;
		int result = 0;
		int temp = number;

		while (number > 0) {
			rem = number % 10;
			number = number / 10;
			result = (int) (result + Math.pow(rem, 3));
		}

		if (temp == result) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}

	}

}
