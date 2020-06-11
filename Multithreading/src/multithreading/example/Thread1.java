package multithreading.example;

public class Thread1 {

	public static void main(String[] args) {
		MyClass1  t1 = new MyClass1();
		t1.start();
		System.out.println(Thread.currentThread().getName());
	}
}
