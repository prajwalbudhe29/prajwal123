package String;

public class StringBuffer1 {

	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer("Hello");
	
	System.out.println("Original StringBuffer value :" +sb)	;//hello
	sb.append("Java"); // now original string change
	System.out.println(sb);//hello java
	sb.insert(5,"Pune"); //now original string is changed
	System.out.println(sb); //hellopune java
	sb.replace(1, 3, "XXX");
	System.out.println(sb); //HXXXloPune Java
	
	sb.delete(1,4);
	System.out.println(sb);// HloPune Java
	
	StringBuffer s1 = new StringBuffer("Banglore is known for IT");
	s1.reverse();
	System.out.println(s1);
	StringBuffer s2= new StringBuffer();
	s2.append("Hello");
	System.out.println(s2.capacity());
	
	s2.append("java is my favourite language");
	System.out.println(s2.capacity())	; // now (16*2)+2=34 i.e(oldcapacity*2)+2
	s2.append("I am from automation area ");
	System.out.println(s2.capacity());
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
