package multithreading.example;

public class MyClass1 extends Thread{
	
	public void run() {
		System.out.println("In Child Thread");
		System.out.println(Thread.currentThread().getName());
	}
}
