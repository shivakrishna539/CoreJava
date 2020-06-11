package StringExample1;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String s1 = new String("First String");
		char[] ch = s1.toCharArray();
		System.out.println("String Hashcode" + s1.hashCode());
		System.out.println("Character Hashcode" + ch.hashCode());
		System.out.println(s1.length());
		int i = 13;
		System.out.println(s1.valueOf(i));
		int res = s1.compareTo("First String"); //0
		System.out.println(res);
		System.out.println("Index check : " + s1.indexOf("r"));
		System.out.println("Index check : " + s1.lastIndexOf("r"));
		String s2 = s1.intern();
		System.out.println("Intern method s2: " + s2 +" : "+ s2.hashCode() + " s1 hashcode: " + s1.hashCode());
		
		String s3 = "Second String";
		String s4 = new String("Second String");
		System.out.println("s3 value: " + s3 +" and hashcode : " + s3.hashCode());
		System.out.println("s4 value: " + s4 +" and hashcode : " + s4.hashCode());
	}
}
