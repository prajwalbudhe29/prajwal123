package String;

public class StringClass1 {

	public static void main(String[] args) {

	StringClass1 c1 = new StringClass1();
	System.out.println("c1 :" +c1);// String representation of an object because of toString()
	
	// String class object creation 
	//1. using literal
	
	String s1 = "Mumbai"; //new object will be create in string constant pool 
	String s2 = "Mumbai";// no object will be create as its duplicate object , so 's2' will point to 's1' object 
	
	String s3 = "Bangalore"; // new object will be create in string consatnt pool  
		
		System.out.println("s1:"+s1); //object value because toString() is overrided in String class
		
		System.out.println("s1:"+s1);// object valur because toString() is overrided in String class
		
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s1 char count :"+s1.length());
		System.out.println("s2 char count :"+s2.length());
		System.out.println("s3 char count :"+s3.length());
		
		/*
		 * Outside String class
		 * == ----> campare two value
		 * .equals(obj) ---> cpompare two object based on there address
		 * 
		 * Inside String class 
		 * == ---> compare two object based on there address
		 * .equals ----> based on value
		 *  
		 */
		System.out.println("s1 and s2 equlas() :"+s1.equals(s2));// compare based on va;lue
		System.out.println("s1 and s2 using '==' :" +(s1==s2)); // based 0n address
		
		System.out.println("s1 and s3 equlas() :"+s1.equals(s3));// compare based on va;lue
		System.out.println("s1 and s3 using '==' :" +(s1==s3));
		
		String s4 = new String("Mumbai" ); // 1. constant pool 2. non constant pool  
	System.out.println("s4 :"+s4);
	
	System.out.println(" s1 ans s4 using equals() :"+ s1.equals(s4));
	 System.out.println("s1 and s4 Using == :" +(s1==s4));
	 
	  String s5 = new String("Mumbai");// 1. constant pool 2. non constant pool  
	  
		System.out.println("s5:"+s5);
		System.out.println(" s4 and s5 equals() :" +s5.equals(s4));
		System.out.println(" s4 and s4 '==' :" +(s4==s5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
