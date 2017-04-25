package pageObjects;

import java.awt.event.KeyEvent;

import org.apache.xpath.compiler.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp_Company_Page {
	public SignUp_Company_Page(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
	}

		private static WebElement element = null;
	
	public static WebElement company_sign_up_logo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vendor"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement text_company_sign_up(WebDriver driver){
		
		try{
			element = driver.findElement(By.className("TextView"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_company_name(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_name"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_about_company(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_about"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_email(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_email"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_password(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_pass"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_confirm_password(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_cpass"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_contact_number(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_reg_contact"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement input_field_comapny_address(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("Vend_reg_address"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_step_one_next(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_one_next_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_step_two_upload(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("upload_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	

	public static WebElement button_step_two_back(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_two_back_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_step_two_next(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_two_next_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_step_three_back(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_three_back_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_step_three_next(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_three_next_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement dropdown_step_three_location(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("location_text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_final_step_back(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_step_four_back_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_final_step_register(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("vend_register"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement text_registration_successful(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_login_after_successful_registration(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("okBtn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement text_snackbar_step_one(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("snackbar_text"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_upload_company_logo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("upload_btn"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_take_photo_company_logo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("take_photo"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_choose_from_gallery_company_logo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("choose_photo"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_cancel_company_logo(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("cancel"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement text_company_logo_title(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("upload_title"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	public static WebElement button_mobile_camera_done(WebDriver driver){
		
		try{
			element = driver.findElement(By.id("btn_done"));
           // Log.info("Username text box is found on the Login Page");
    	}catch (Exception e){
       		//Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        
	 }
	
	/*public void clickCamera()
	{
	  Keywords.KeyEvent(27);
	  KeyEvent.KEYCODE_9);
	  System.out.print("Clicked on Camera ");
	}
	public static void keyBoardEvent(int eventNumber) 
	  {
			try 
			{
				Runtime.getRuntime().exec("cmd /C adb shell input keyevent " + eventNumber);
				Thread.sleep(3000);
			} 
			catch (Throwable t) 
			{
				t.printStackTrace();
			}
	}*/



}
