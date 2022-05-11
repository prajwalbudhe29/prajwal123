package localGlobalVariable;

public class StaticGlobalVariable2 {

	static int age=25;
	
	public static void main(String[] args) {
		System.out.println("Program start.....");
		System.out.println("SGV : "+age);
		System.out.println("SGV with standard: "+StaticGlobalVariable2.age);
	System.out.println(".................................");
	age=30;
	System.out.println("SGV : "+age);
     System.out.println("SGV with standard: "+StaticGlobalVariable2.age);
}
}    	