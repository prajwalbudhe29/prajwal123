package Array;

public class Array3 {

	public static void main(String[] args) {
	
		int[] numbers = {2,-9, 0, 5,12,-25,22,9,8,12};
		
		double sum = 0;
		double average;
		//access all element using for each loop add element in sum 
		for(int number : numbers) {
			sum= sum + number ;
			
		}
		//get the total number of elements
		int arrayLength = numbers.length;
		
		//calculate the average convert the average from int to double 
		 average = sum /arrayLength ;
		 System.out.println("Sum = " +sum );
		 
		System.out.println("Average ="+ average);
		
		
		
		
		
		
		
		
		
	}

}
