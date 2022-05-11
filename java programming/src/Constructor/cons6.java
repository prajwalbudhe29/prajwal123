package Constructor;

class C{
	double i = 10.23;
	
	C(double j) {
		
		System.out.println("Running class C constrctor ....");
		i=j ;
		
	}
}

public class cons6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main() of class cons5 is started");
 C b1 = new C(14.56);
 
		System.out.println("Class C global variable i = " + b1.i);
		
		C b2 = new C(45.87);
		System.out.println("Class c global variable i = "+ b2.i);
		
		
		
	}

}
