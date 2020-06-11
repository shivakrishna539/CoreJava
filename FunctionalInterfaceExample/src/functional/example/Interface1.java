package functional.example;

@FunctionalInterface
public interface Interface1 {

	public void test();
	
	default String getGreeting() {
        return "Good Morning!";
    }
	
	static String get() {
		return "Interface1 static method";
	}
}
