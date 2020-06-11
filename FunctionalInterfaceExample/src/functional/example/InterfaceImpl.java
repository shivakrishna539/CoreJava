package functional.example;

public class InterfaceImpl implements Interface1,Interface2{
	
	public static void main(String[] args) {
		System.out.println(new InterfaceImpl().getGreeting());
		System.out.println(Interface1.get());
		System.out.println(Interface2.get());
	}

	@Override
	public String getGreeting() {	
		return Interface1.super.getGreeting() + Interface2.super.getGreeting();
	}
	@Override
	public void test() {
		System.out.println("Testing");
	}

}
