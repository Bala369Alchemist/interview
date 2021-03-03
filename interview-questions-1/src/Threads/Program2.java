package Threads;

public class Program2 implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running");
	}
	
	public static void main(String[] args) {
		Program2 p = new Program2();
		Thread t = new Thread(p);
		t.start();
		
	}

}
