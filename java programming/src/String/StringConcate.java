package String;

public class StringConcate {

	public static void main(String[] args) {
		String str = "Pune"+1536;
		System.out.println(str);
		
		String str1 = str.concat(null);// Null pointer exception
		System.out.println(str1);
		

	}

}
