package TestNGadvxml;

import org.testng.annotations.Test;

public class GroupExamples {
  @Test(groups = "Regression") 
  public void testCaseOne() {
	   
	  System.out.println("Im in testgCaseOne - And In Regression Group ");
  }
  @Test(groups = "Regression")
	  
	public void TestCaseTwo()  {
	  System.out.println("IM in testCaseTwo - And in Regression Group");
  }
  @Test(groups = "Smoke Test")
	public void TestCaseThree()  {
	  System.out.println("Im in testCaseThree - and in smoke Group");
  }
  @Test(groups = "Regression")
 public void TestCaseFour() {
	  System.out.println("Im in testCaseFour - And In Regression Group ");
  }
  @Test(groups = "Smoke Test")
	  public void TestCaseFive(){
	  System.out.println("I m in testCaseFive - And In Smoke Group");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
