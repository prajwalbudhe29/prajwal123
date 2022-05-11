package oopps;
//super class / parent / base class
class Grandfather{
	Grandfather(){ 
	System.out.println("i am Grandfather constrctuor");
	}
	void myHome() {
		System.out.println("i am home of Grandfather");
		
	}
}
//subclass / child class / derived class
class Father extends Grandfather {
	Father (double d) {
		super(); //if we dont write this dn java compiler will write by default super()
		System.out.println("i am class father constrctuor ");
	}
		void myBike() {
			System.out.println("i am home of father");
			}
		
}

class Child1 extends Father {
	Child1 (int i ) {
		super(12.34); 
		System.out.println("i am class child constrctuor ");
	}
		void mycar() {
			System.out.println("i am bike of child");
			}
		
}
public class Inheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************************************");
		Child1 c1 = new Child1(21);// home, car & bike
		c1.myHome();
		c1.mycar();
		c1.myBike();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Father f1 = new Child1(10);//Father f2 = c1; home, car but bike will not be visible/accessible to father
		f1.myHome();
		f1.myBike();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1 = new Child1(20);//Grandfather g2=c1; home but car & bike will not be visible/accessible to Grandfather
		g1.myHome();
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g2 = new Father(12.36);// home but car , bike will not be visible/accessible to father
		g2.myHome();
	}


	}


