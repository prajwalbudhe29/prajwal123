package Constructor;

class A {
	int i = 10;
	A(){
		System.out.println("Running Class A constructor ");
		
	}
void display() {

System.out.println(" I am display of classA. ");
}
}

class X {
	int j=10;
	
	X() {
		
		System.out.println("Running class X constructor");
	}
		
		void display() {
		System.out.println("I am display() of class5 ");
		
	}
   public class cons5 {
		public void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("Main() of class cons5 is started");
			
			A a1 = new A();
			
			a1.display();
			System.out.println("Class A global variable i = " +a1.i);
			
			X x1 = new X();
			x1.display();
			
			System.out.println("Class x global variable j = "+ x1.j);
			
			cons5 c1 = new cons5();
			
			//c1.display();
			
			System.out.println("Main() of class cons5 is ends here.....");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
}