package oopps;
//parent class 
class fruitA {
	int fruitAge;
	fruitA() {
	System.out.println("fruit class cons...");
	fruitAge = 7;
	
}
public void taste() {

	System.out.println("fruits are sweet");
}
}
//child class of fruits 
class mango extends  fruits {
 int fruitAge;
 mango() {
//super(); //java compiler will write default super()
System.out.println("mango class cons....");
fruitAge=5;
 }
 public void taste() {
	System.out.println("mango are tart in taste");
	
 }
public void shape() {
System.out.println("mange is round");


}
}
public class Inheritance8 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("***************************************************");
	mango m1=new mango();
	m1.shape(); //mango is round 
	m1.taste(); // mango are tart in taste
	System.out.println("m1.fruitAge");//5
	
	fruitA f1 = new fruitA();
	f1.taste();//fruit are sweet 
	System.out.println("f1.fruitAge");//7
	System.out.println("***************************************************");

	

}
}











