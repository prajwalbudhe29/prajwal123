package oopps;

class A {
	static int a = 10;
	int b = 20;
	double c= 13.45;
	}
class B {
	static int x = 30;
	int y =40;
	double z = 53.45;
	
}

class C {
	static int p= 50;
	int q =60;
	double r = 66.45;
	
}
public class Inheritance0 {

	public static void main(String[] args) {
	
		/*********************Access static member class A members **************************/
		System.out.println("class A static variable : "+A.a);
		/*********************Access static member class b members **************************/
		System.out.println("class B static variable: "+ B.x);
		/*********************Access static member class c members **************************/
		System.out.println("class C static variable : "+ C.p);
		
		/*********************Access non-static member class A members **************************/
		A a1= new A();
		 System.out.println("class A non-static variableb : "+a1.b);
		 System.out.println("class A non-static variableb : "+a1.c);		
		/*********************Access non-static class  C members **************************/
		C c1= new C();
		 System.out.println("class c non-static variableb : "+c1.q);
		 System.out.println("class c non-static variableb : "+c1.r);
		/*********************Access non-static member class c members **************************/
		B b1= new B();
		 System.out.println("class b non-static variableb : "+b1.y);
		 System.out.println("class b non-static variableb : "+b1.z);
	}

}
