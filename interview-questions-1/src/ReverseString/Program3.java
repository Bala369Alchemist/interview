package ReverseString;

public class Program3 {

	public static void main(String[] args) {
		String str = "balakrishnan";
		String reverse = reverseString(str);
		System.out.println(reverse);
	}
	
	static String reverseString(String string) {
		if(string.isEmpty()) {
			return string;
		}
			return reverseString(string.substring(1)) + string.charAt(0);
	}
	
}
