package oopps;
//parent class 
 class fourwheeler {
	 //default constructor
	 public void wheels() {
		 System.out.println("I have 4 wheels");
		 
	 }
 }

//child class of fourwheeler and parent of maruti
 class car extends fourwheeler {
	 //default constructor with default super()
	 public void type() {
		 System.out.println("i am a car");
		 
	 }
 }
//child class of car 
class maruti  extends car {
	 //default constructor with default super()
	 public void company() {
		 System.out.println("i am a maruti");
	 }
}
		 
public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 maruti fr = new maruti(); // object of child class
  fr.wheels();
  fr.type();
  fr.company();
  


	}

}
