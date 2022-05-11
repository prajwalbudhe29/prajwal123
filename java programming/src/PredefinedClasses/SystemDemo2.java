package PredefinedClasses;


class training{
	 training(){
	 System.out.println("prajwal kumar");
	 
	 
}

void manualtesting() {
	 System.out.println("prajwal budhe");
}

void automationtesting(){
	 System.out.println("prajwalkumar budhe");
}
public static class SystemDemo2 {
static  training t1=new training();

	public  void main(String[] args) {
		 
		SystemDemo2.t1.manualtesting();
		SystemDemo2.t1.automationtesting();

		training t2=new training();
		t2.manualtesting();
		t2.automationtesting();
	}
}
}