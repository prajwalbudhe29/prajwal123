package oopps;
class Animal1 {
	public void move() {
		System.out.println("Animals can move");
		
} 
	
}
class Dog extends Animal1{
	public void move() {
		System.out.println("Dog canwalk and run");
	}
		public void bark() {
			System.out.println("dog can bark");
		}		
}
public class Overriding1 {

	public static void main(String[] args) {
		Animal1 a = new Animal1(); // Animals refernce and 0bject 
       a.move();  
       Dog b = new Dog(); // Animal reference but dog obj
       b.move(); // // run the method in dog class
       b.bark(); // run the method in dog class
       System.out.println("**************************************");
       Animal1 a1= new Dog(); // you will get dog class move() , bark ()       
       a1.move(); //Dog can walk run
       //a1.bark(); // a1 compile time error since b's reference type Animal doesn't
	}

}