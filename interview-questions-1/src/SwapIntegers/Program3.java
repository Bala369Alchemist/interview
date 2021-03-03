package SwapIntegers;

public class Program3 {

	public static void main(String[] args) {
		int n1 = 35;
		int n2 = 56;
		System.out.println("n1 : "+n1+"  ,  n2 :"+n2);
		
		n1 = n1^n2;
		n2 = n1^n2;
		n1 = n1^n2;
		
		System.out.println("n1 : "+n1+"  ,  n2 :"+n2);
	}
	
}
