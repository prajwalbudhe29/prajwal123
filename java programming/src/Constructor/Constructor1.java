package Constructor;

public class Constructor1 {
	
	public 	Constructor1() {
		System.out.println("this is a zero para constrctor");
		
		
	}	
	 
	public Constructor1(char c) {
		System.out.println("Thius is a single-para constructor");
		
		}
	public Constructor1(int num1, int num2) {
		
		System.out.println("This int-int parameterized constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1();
		Constructor1 c3 =new Constructor1();
		
	}
}
