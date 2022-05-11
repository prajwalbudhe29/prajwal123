package oopps;
class  Animal2 {
	public void move() {
		System.out.println("Animal can move");
	}
}
class Dog2 extends Animal2{
	public void move() {
		super.move(); 
		System.out.println("Dog can walk and run");
	}
	}
public class Overriding2 {

	public static void main(String[] args) {
	Animal2 b = new Dog2()	; // Animal referbut dog obj
	b.move(); //
	

	}

}
