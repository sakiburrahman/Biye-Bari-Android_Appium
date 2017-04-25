package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_Page {
	public SignUp_Page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

		private static WebElement element = null;
	
	public static WebElement link_sign_up(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("login_signup"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }

}
