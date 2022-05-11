package Method;

public class Method4 {

	public static void main(String[] args) {
		double sum = getAdditionResult(25,30);
		sum = sum*100;
			

		System.out.println("Result of Addition :" +sum);
		System.out.println("Result of addition2 :" + Method4.getAdditionResult(250.6 , 23));
				
		
		}
static double getAdditionResult(double num1 , double num2) {
	double res = num1 + num2 ;
	return res ;
	
}
}
