package multithreading.example2;

public class Thread2 {

	public static void main(String[] args) {
		
		MyClass2  m1 = new MyClass2();
		Thread t2 = new Thread(m1);
		t2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
