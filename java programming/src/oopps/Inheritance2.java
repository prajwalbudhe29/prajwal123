package oopps;
//parent class 
class fruit {
	fruit() {
	System.out.println("fruit class cons...");

}
 public void taste() {
	 System.out.println("fruit class sweet");
	 
 }
}
//child class of fruit
class apple extends fruit {
	apple() {
		//super(); // java compiler will write default super ()
		System.out.println("Apple class cons...");
		
	}
	public void shape() {
		System.out.println("apple is round");
		
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
apple fr = new apple();// object of child class
fr.taste();//call method of parent class
fr.shape();//call method of child class
	}

}
