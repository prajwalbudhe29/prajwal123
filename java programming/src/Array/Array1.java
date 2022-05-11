package Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//declaration
		int a[];
		//size initialization
		a = new int [5];
		*/
		//or
		int a[] =new int[5]; //declaration and initialization 
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		a[0]=10;//initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("*************After initialization******");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//or
		System.out.println("Array Element counts:"+a.length);
		System.out.println("****************normal for-loop**************");
		/**
		*LHS should be same as type in form in form of datatype or class
		*for(LHS:RHS){
		*
		*}
		*/
		for(int num:a) {
		System.out.println(num);
		}
		
	
	//	int[] getArray2=new int[]{10,20,30,40,50};
    //  for(int num1: getArray2){
	//  System.out.println(num1);
	  
	  //original program
	   char[] getArray = new char[] {'A','B','C','D'};
		int[] getArray2={10,30,50,90,60};
		System.out.println("***********for-each loop------5************");
		for(char num: getArray){
	System.out.println(num);
			}
			}
			}




	
