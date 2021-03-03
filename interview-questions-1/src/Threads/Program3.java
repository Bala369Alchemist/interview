package Threads;

class App implements Runnable{
	public void run() {
		for(int j = 0 ; j<=10; j++) {
			System.out.println("App :"+j);
		}
	}
}

public class Program3 {
	public static void main(String[] args) {
		System.out.println("application started");
		
		App a = new App();
		Thread t = new Thread(a);
		t.start();
		
		for(int i = 0 ; i<=10;i++) {
			System.out.println("Program3 :"+i);
		}
		System.out.println("application ended");
	}
}
