package ReverseNumber;

public class Program1 {

	public static void main(String[] args) {
		int number = 234878432;
		int reverse = reverse(number);
		
		if(number==reverse) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
	
	public static int reverse(int num) {
		int reverse = 0;
		while(num>0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num/10;
		}
		return reverse;
	}
}
