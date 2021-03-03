package ReverseString;

public class Program2 {

	public static void main(String[] args) {
		String str = "balakrishnan";
		String reverse = reverseString(str);
		System.out.println(reverse);
	}
	
	private static String reverseString(String string) {
		int length = string.length();
		String reverse = "";
		for(int i = length-1 ; i>=0 ; i--) {
			reverse = reverse + string.charAt(i);
		}
		return reverse;
	}
	
}
