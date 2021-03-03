package reverseWordsInString;

public class Program1 {

	public static void main(String[] args) {
		String str = "Welcome To Java";
		String[] array = str.split(" ");
		
		String reversedString = "";
		
		for(String string : array) {
			StringBuffer sb = new StringBuffer(string);
			sb.reverse();
			reversedString = reversedString +sb.toString()+" ";
		}
		System.out.println(reversedString);
	}
	
}
