package sample;

class A {
	 void draw () {
		 System.out.println("prajwal budhe");
	 }
	 
}
class B extends A {
	
	void draw() {
		super.draw();
		System.out.println("raju budhe");
		
	}
}

public class MethodOverriden {

	public static void main(String[] args) {
		A r = new B();
		r.draw();
				

	}

}
