package interview;
import java.util.Arrays;
public class Program1 {

	public static void main(String[] args) {

		System.out.println("Original String");
		System.out.println();
		String question = "C ,Z ,A ,P ,\n" + "R ,S ,P ,B ,\n" + "G ,D ,M ,C ";
		System.out.println(question);
		System.out.println();

		// code to sort each row of string
		System.out.println("Sorted String Array");
		// split based on \n
		String[] arrSplit = question.split("\n");

		for (String string : arrSplit) {
			// split sub string based on delimiter , and save into a string array
			String[] temp = string.split(",");
			// sort the string array
			Arrays.sort(temp);
			// display the sorted string array
			System.out.println();
			for (String str : temp) {
				System.out.print(str + ",");
			}
		}
	}
}
