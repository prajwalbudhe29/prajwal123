package Casting;

public class PrimitiveCasting2 {

	
		public static void main(String []args){
			int salary=300000;
			/*explicit widening*/
			double salaryDouble=(double)salary;
			float salaryFloat=(float)salary;
			System.out.println("**********explicit widening*********");
			System.out.println("salary: "+salary+"\nsalaryDouble:"+salaryDouble+"nsalaryFloat :"+salaryFloat);

			System.out.println("**********implicit widening*********");
			/*implicit widening or auto-widening*/
			double salaryDouble2=salary;
			float salaryFloat2=salary;
			System.out.println("salary:"+salary+"\nsalaryDouble2:"+salaryDouble2+"\nsalaryFloat2 :"+salaryFloat2);
			double salaryDb=30000.35d;
			/*explicit norrowing*/
			int salaryInt=(int)salaryDb;
			float salartFt=(float)salaryDb;
			System.out.println("**********explicit widening*********");
			System.out.println("salaryDb:"+salaryDb+"\nsalaryInt:"+salaryInt+"\nsalaryFt :"+salartFt);
			   /*implicit norrowing not possible*/
			//  int salary2=salaryDb;
			//  float salaryFt2=salaryDb;
	}

}
