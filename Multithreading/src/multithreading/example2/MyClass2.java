package multithreading.example2;

public class MyClass2 implements Runnable{
	public void run() {
		System.out.println("In Child Thread");
		System.out.println(Thread.currentThread().getName());
	}
}
