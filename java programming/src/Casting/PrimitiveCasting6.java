package Casting;

 class Sample1{
	double test1 () {
    System.out.println("Running test1");
	return  4;
	
	 }
 }

public class PrimitiveCasting6 {

public static void main(String[] args) {
	System.out.println("Program start");
	
	Sample1 s= new Sample1();
    int res= (int)s.test1();
	
	double res1 = (double) s.test1();

	}

}
