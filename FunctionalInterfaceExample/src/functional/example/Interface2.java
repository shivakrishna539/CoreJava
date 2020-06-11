package functional.example;

@FunctionalInterface
public interface Interface2 {

	public void test();
	
	default String getGreeting() {
        return "Good AfterNoon!";
    }
	
	static String get() {
		return "Interface2 static method";
	}
}
