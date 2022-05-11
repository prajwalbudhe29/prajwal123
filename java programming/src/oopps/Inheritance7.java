package oopps;
//parent class
class fruits {
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons...");
		fruitAge = 7;
		
	}
	public void taste() {;
	
		System.out.println("fruits are sweet");
	}
}
//child class of fruits 
 class orange extends  fruits {
	 int fruitAge;
	 orange() {
//super(); //java compiler will write default super()
System.out.println("orange class cons....");
fruitAge=5;
	 }
	 public void taste() {
		System.out.println("orange are sweet");
		
	 }
public void shape() {
	System.out.println("orange is round");
	System.out.println("Orange fruitAge:"+ fruitAge);
	System.out.println("Fruit fruitAge:"+super.fruitAge);
	taste();
	super.taste();
}
}
public class Inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************************************************");
		orange o1=new orange();
		o1.shape();
		
		System.out.println("***************************************************");
	}
}

/* 
 * super: is a keyword or instance of super class
 *                    use to refer super class non-static members
 *                    mainly used when subclass and super class having common non-static members
 */







