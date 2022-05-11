package exceptionalHandling;

public class ExceptionalHandling {

	public static void main(String[] args) {
		
System.out.println("program statrts from here.....");
//1. abnormal statements
int i=10;
int j = i/0 ;//Arithmetic Exception
System.out.println("res: " +j);
		
//2. abnormal statements
int[] empIds = new int [3];
empIds[3]=101;//ArrayIndexoutOfBoudsException

//3. abnormal statements
String str= null ;
System.out.println(str.length());// Null Pointer Exception

//4. abnormal statements
String s = "abc ";
int num= Integer.parseInt(s);//NumberFormateException
System.out.println("num:" +num);

System.out.println("program end here.....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
