package Block;

public class Block2 {

	static {
		System.out.println(" running static block");
		}
	public static void main(String[] args) {
		
	{
	int a=20; int b=30; int res = a+b;
              System.out.println("result non static block gets executed:" +res);

	
	
	}
		}
}