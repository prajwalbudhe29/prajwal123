package localGlobalVariable;

public class NonStaticVariable2 {
	//Global Variable
	int mobileNum  =123; //Non-Sattic Global Variable
	char grade;////Non-Sattic Global Variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("Program start...........");
     // create an object 
   System.out.print("**************r1 Object****************");
		NonStaticVariable2 r1=new NonStaticVariable2();
		 System.out.println("mobilenum with r1 reference:"+r1.grade);
		 System.out.println("grade with r1 reference:"+r1.grade);

		 System.out.print("**************x1 Object****************");
		 NonStaticVariable2 x1=new NonStaticVariable2();
		 System.out.println("mobilenum with x1 reference:"+x1.grade);
		 System.out.println("grade with x1 reference:"+x1.grade);
		 System.out.println("**************updated x1 Object****************");
		x1.grade = 'A' ;
		 x1.mobileNum=987;
		 System.out.println("updated ,mobilenum with x1 reference:"+x1.grade);
		 System.out.println("updated ,grade with x1 reference:"+x1.grade);
		 System.out.println("**************updated x1 Object****************");
		 
		 System.out.println("mobilenum with r1 reference:"+r1.grade);
		 System.out.println("grade with r1 reference:"+r1.grade);

		
		
		
		
		
		
		
		
		
		
		
	}

}
