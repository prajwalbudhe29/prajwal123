package Casting;
class A2{
	void test1 (){
		System.out.println("Running test()");
		}
	}

class B2 extends A2{
	void test2() {
		System.out.println("running test2()");
		
	}
}

class C2 extends B2 {
	void test3() {
		
	}
}

public class Autoupcasting {

	public static void main(String[] args) {
		C2 c2 =new C2();
		

	}

}
