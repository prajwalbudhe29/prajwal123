package orgwhileloop;


public class PrimeNoPrint {

	public static void main(String[] args) {
	PrimeNoPrint obj = new PrimeNoPrint();
				obj.test();
				}
public void test() {
			for(int i=1 ;i<100;i++ ) {	
				int temp=0;
				for(int j=2; j<=i-1;j++) {
					if(i%j==0) {
						temp++;
					}
				}
				if(temp==0) {
					System.out.println(i+" ");
				}
						
					}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
