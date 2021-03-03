package minAndMax;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		int[] arr = {6,89,4,8,12,92,54};
		System.out.println((Arrays.stream(arr).max().getAsInt()));
	}

}
