package Threads;

public class Program1 extends Thread{

	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		Program1 obj = new Program1();
		obj.start();
	}
	
}
