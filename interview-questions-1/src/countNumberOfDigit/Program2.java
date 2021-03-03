package countNumberOfDigit;

public class Program2 {

	public static void main(String[] args) {
		int num = 3245634;
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0) {
			int rem = num % 10 ;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("Even Numbers : "+even_count);
		System.out.println("Odd Numbers : " +odd_count);
	}
	
}
