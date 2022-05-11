package String;

public class StringBuilder1 {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Java");
		System.out.println("sb :" +sb);
		
		sb.reverse();
		System.out.println(sb);
		StringBuilder sb1= new StringBuilder("Hello java");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Hello java");
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		//we don't have any method in Stringbuffer and StringBuilder to campare object values , so to overcome that
		
		//first convert StringBuffer / Stringbuilder to String class using tostring()
		//dn use equals() of string class 
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		
		
		
		
		
		
		

	}

}
