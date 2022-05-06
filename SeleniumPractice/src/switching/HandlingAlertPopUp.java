package switching;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingAlertPopUp {

	public static void main(String[] args) {

     SeleniumUtility s1 = new SeleniumUtility();
 
	WebDriver driver = s1.setUp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert")	;
	
	//as the required element is present inside the frame ,so need to switch our control inside frame first
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//button[text()='Try it')")).click();
	
	System.out.println("Alert text msg is :" +driver.switchTo().alert().getText());
	
	// to perform anather action , we need to again switch our control to the alert 
	
	driver.switchTo().alert().accept();
	
		
		
		

	}

}
