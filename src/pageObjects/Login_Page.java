package pageObjects;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.*;



public class Login_Page{
	
		public Login_Page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

		private static WebElement element = null;
	
	public static WebElement biyebarilogo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("login_bb_logo"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_email(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("login_email"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	public static WebElement input_field_password(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("login_password"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement button_login(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("login_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement progress_bar_login(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("progress"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement slider_bar_company(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("sb_text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement snackbar_login_panel(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("snackbar_text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement snackbar_before_login(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("snackbar_text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
	
	public static WebElement snackbar_action_before_login(WebDriver driver) throws Exception{
		
		try{
			element = driver.findElement(By.id("snackbar_action"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	}
}