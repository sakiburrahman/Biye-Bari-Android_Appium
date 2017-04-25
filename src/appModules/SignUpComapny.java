package appModules;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import java.util.concurrent.TimeoutException;

import org.apache.xpath.compiler.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

//import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.*;
import utility.ExcelUtils;
//import utility.Constant;
//import utility.ExcelUtils;
//import utility.Log;

public class SignUpComapny extends appModules.BaseClass {
	
	private static final TimeUnit SECONDS = null;
	//public static AndroidDriver driver;
	
	/*
	@Test(testName ="Test Sign Up Company Logo")
	public static void test_sign_up_company_logo() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	 
			//Login_Page.slider_bar_company(driver).click();
			//WebDriverWait wait = new WebDriverWait(driver, 20);
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).isDisplayed();
	    	SignUp_Company_Page.company_sign_up_logo(driver).isEnabled();
			//String text_Sign_Up_Company = SignUp_Company_Page.text_company_sign_up(driver).getText();
			//System.out.println(text_Sign_Up_Company);
			//Assert.assertEquals(text_Sign_Up_Company, "Comapny");
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }
	
	@Test(testName ="Test Sign Up Using Company")
	public static void test_sign_up_using_company() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	 
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).click();
	    	
	    	//Step 1
	    	SignUp_Company_Page.input_field_company_name(driver).sendKeys("MAMA'S COmpany1");
	    	SignUp_Company_Page.input_field_about_company(driver).sendKeys("Software Company");
	    	SignUp_Company_Page.input_field_email(driver).sendKeys("mamacompan6y1@yopmail.com");
	    	SignUp_Company_Page.input_field_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_confirm_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_contact_number(driver).sendKeys("01674309995");
	    	SignUp_Company_Page.input_field_comapny_address(driver).sendKeys("Banani Dhaka");
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	
	    	
	    	//Step 2
	    	SignUp_Company_Page.button_step_two_next(driver).click();
	    	
	    	//Step 3
	    	SignUp_Company_Page.dropdown_step_three_location(driver).click();
	    	//Select odropdownSelect = new Select(SignUp_Company_Page.dropdown_step_three_location(driver));
	    	//odropdownSelect.selectByIndex(1);
	    	//odropdownSelect.selectByIndex(2);
	    	
	    	//Select values from dropdown menu.
	    	driver.findElement(By.name("Dhaka")).click();
	    	
	    	
	    	//Select Checkbox
	    	driver.findElement(By.name("Banani")).click();
	    	driver.findElement(By.name("Dhanmondi")).click();
	    	driver.findElement(By.name("Elephant Road")).click();
	    	
	    	//Click step three next button
	    	SignUp_Company_Page.button_step_three_next(driver).click();
	    	
	    	//Select Product Name from Final
	    	driver.findElement(By.name("Band")).click();
	    	driver.findElement(By.name("Community Centre")).click();
	    	driver.findElement(By.name("Celebrity")).click();
	    	driver.findElement(By.name("Clothing Design")).click();
	    	driver.findElement(By.name("Car Decoration")).click();
	    	
	    	//Click Register button
	    	SignUp_Company_Page.button_final_step_register(driver).click();
	    	
	    	//Check Registration Successful message
	    	String registrationSuccessful = SignUp_Company_Page.text_registration_successful(driver).getText();
	    	Assert.assertEquals(registrationSuccessful, "Registration Successful");
	    	
	    	//Click on Login button from registration successful page
	    	SignUp_Company_Page.button_login_after_successful_registration(driver).click();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	//driver.scrollToExact("United Kingdom");
	    	
	    	
	    	//SignUp_Company_Page.button_step_three_next(driver).click();
	    	
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }
	

	@Test(testName ="Test Error Messages email is invalid and contact number is invalid")
	public static void test_error_messages_email_contact() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	//Navigate to company sign up page 
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).click();
	    	
	    	//Click on next page from step 1
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	
	    	//Test 'Selected Field(s) Required' Snackbar text
	    	String text_Snackbar_requried_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	Assert.assertEquals(text_Snackbar_requried_step_one, "Selected Field(s) Required");
	    	
	    	//Test Snackbar 'email is invalid' and 'contact number is invalid' text
	    	SignUp_Company_Page.input_field_company_name(driver).sendKeys("MAMA'S COmpany1");
	    	SignUp_Company_Page.input_field_about_company(driver).sendKeys("Software Company");
	    	SignUp_Company_Page.input_field_email(driver).sendKeys("mamacompan6");
	    	SignUp_Company_Page.input_field_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_confirm_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_contact_number(driver).sendKeys("01674309");
	    	SignUp_Company_Page.input_field_comapny_address(driver).sendKeys("Banani Dhaka");
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	String text_Snackbar_invalid_email_contact_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	Assert.assertEquals(text_Snackbar_invalid_email_contact_step_one, "Email is Invalid\nContact Number is Invalid");
	    	
	    	
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }
	
	@Test(testName ="Test Error Messages Minimum Password Length is 6 and Contact Number is Invalid")
	public static void test_error_messages_password_contact() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	//Navigate to company sign up page 
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).click();
	    	
	    	//Click on next page from step 1
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	
	    	//Test 'Selected Field(s) Required' Snackbar text
	    	//String text_Snackbar_requried_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	//Assert.assertEquals(text_Snackbar_requried_step_one, "Selected Field(s) Required");
	    	
	    
	    	
	    	//Test Snackbar Email is Invalid 'Minimum Password Length is 6' and 'Contact Number is Invalid' text
	    	SignUp_Company_Page.input_field_company_name(driver).sendKeys("MAMA'S COmpany1");
	    	SignUp_Company_Page.input_field_about_company(driver).sendKeys("Software Company");
	    	SignUp_Company_Page.input_field_email(driver).sendKeys("mamacompan6@yopmail.com");
	    	SignUp_Company_Page.input_field_password(driver).sendKeys("12345");
	    	SignUp_Company_Page.input_field_confirm_password(driver).sendKeys("12345");
	    	SignUp_Company_Page.input_field_contact_number(driver).sendKeys("016743099");
	    	SignUp_Company_Page.input_field_comapny_address(driver).sendKeys("Banani Dhaka");
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	String text_Snackbar_invalid_email_password_length_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	System.out.println(text_Snackbar_invalid_email_password_length_step_one);
	    	Assert.assertEquals(text_Snackbar_invalid_email_password_length_step_one, "Minimum Password Length is 6\nContact Number is Invalid");
	    	
	    	
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }
	
	@Test(testName ="Test Error Messages email is invalid and Minimum Password Length is 6")
	public static void test_error_messages_email_password() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	//Navigate to company sign up page 
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).click();
	    	
	    	//Click on next page from step 1
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	
	    	//Test 'Selected Field(s) Required' Snackbar text
	    	//String text_Snackbar_requried_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	//Assert.assertEquals(text_Snackbar_requried_step_one, "Selected Field(s) Required");
	    	
	    
	    	
	    	//Test Snackbar Email is Invalid 'Minimum Password Length is 6' and 'Contact Number is Invalid' text
	    	SignUp_Company_Page.input_field_company_name(driver).sendKeys("MAMA'S COmpany1");
	    	SignUp_Company_Page.input_field_about_company(driver).sendKeys("Software Company");
	    	SignUp_Company_Page.input_field_email(driver).sendKeys("mamacompan6");
	    	SignUp_Company_Page.input_field_password(driver).sendKeys("12345");
	    	SignUp_Company_Page.input_field_confirm_password(driver).sendKeys("12345");
	    	SignUp_Company_Page.input_field_contact_number(driver).sendKeys("01674309999");
	    	SignUp_Company_Page.input_field_comapny_address(driver).sendKeys("Banani Dhaka");
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	String text_Snackbar_invalid_email_password_length_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	System.out.println(text_Snackbar_invalid_email_password_length_step_one);
	    	Assert.assertEquals(text_Snackbar_invalid_email_password_length_step_one, "Email is Invalid\nMinimum Password Length is 6");
	    	
	    	
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }
	
*/
	@Test(testName ="Test Upload Company Logo")
	public static void test_upload_company_logo() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	//Navigate to company sign up page 
	    	SignUp_Page.link_sign_up(driver).click();
	    	SignUp_Company_Page.company_sign_up_logo(driver).click();
	    	
	    	//Click on next page from step 1
	    	//SignUp_Company_Page.button_step_one_next(driver).click();
	    	
	    	//Test 'Selected Field(s) Required' Snackbar text
	    	//String text_Snackbar_requried_step_one = SignUp_Company_Page.text_snackbar_step_one(driver).getText();
	    	//Assert.assertEquals(text_Snackbar_requried_step_one, "Selected Field(s) Required");
	    	
	    
	    	
	    	//Test Snackbar Email is Invalid 'Minimum Password Length is 6' and 'Contact Number is Invalid' text
	    	SignUp_Company_Page.input_field_company_name(driver).sendKeys("MAMA'S COmpany1");
	    	SignUp_Company_Page.input_field_about_company(driver).sendKeys("Software Company");
	    	SignUp_Company_Page.input_field_email(driver).sendKeys("mamacompan6@yopmail.com");
	    	SignUp_Company_Page.input_field_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_confirm_password(driver).sendKeys("123456");
	    	SignUp_Company_Page.input_field_contact_number(driver).sendKeys("01674309999");
	    	SignUp_Company_Page.input_field_comapny_address(driver).sendKeys("Banani Dhaka");
	    	SignUp_Company_Page.button_step_one_next(driver).click();
	    	SignUp_Company_Page.button_upload_company_logo(driver).click();
	    	
	    	//Test Company Logo text
	    	String text_upload_panle_title = SignUp_Company_Page.text_company_logo_title(driver).getText();
	    	System.out.println(text_upload_panle_title);
	    	Assert.assertEquals(text_upload_panle_title, "Company Logo");
	    	SignUp_Company_Page.button_take_photo_company_logo(driver).click();
	    	
	    	//driver.getKeyboard().sendKeys("y");
	    	//KeyEvent 66= Enter key
	    	
	    	// Key code 27 for camera.
	    	//driver.pressKeyCode(27);
	    	driver.pressKeyCode(55);
	    	driver.pressKeyCode(27);
	    	driver.switchTo().alert().accept();
	    	//SignUp_Company_Page.button_mobile_camera_done(driver).click();
	    	
	    	//solo.clickOnView(solo.getView(buttonId));
	    	//driver.pressKeyCode(AndroidKeyCode.getKeyCode()); 
	    	//solo.clickOnButton("Cancel");
	    	//SignUp_Company_Page.button_mobile_camera_done(driver).click();
	    	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	    	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
	    	//KEYCODE_CAMERA
	    	//driver.findElement(By.id("shutter_button_photo")).click();
	    	//driver.findElement(By.id("btn_done")).click();

	    	//driver.pressKeyCode(66);
	    	//driver.pressKeyCode(84);
	    	//driver.pressKeyCode(AndroidKeyCode.ENTER); // should be 66
	    	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH); // should be 84
	    	//driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER); // should be 66

	    	//driver.pressKeyCode(AndroidKeyCode.ENTER); // Press key code is 66
	    	//SignUp_Company_Page.button_mobile_camera_done(driver).click();
	    	//driver.sendKeyEvent(KeyEvent.KEYCODE_9);
	    	//driver.sendKeyEvent(KeyEvent.KEYCODE_HOME);
	    	//Keywords.keyBoardEvent(27);
	    	//SignUp_Company_Page.button_mobile_camera(driver).click();
	    	
	    	
	    	
			}
	    
	     catch ( NoSuchElementException nfe){
	    	 	nfe.printStackTrace();
	    	 	}
	     	
	     catch ( ElementNotVisibleException enve){
	    	 	enve.printStackTrace();
	    	 	}
	     
	     catch ( Exception e){
	    	 	e.printStackTrace();
	    	 	}
	     }

}
