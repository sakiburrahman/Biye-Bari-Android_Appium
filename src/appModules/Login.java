package appModules;


import java.util.concurrent.TimeUnit;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import java.util.concurrent.TimeoutException;


import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import pageObjects.*;
import utility.ExcelUtils;
//import utility.Constant;
//import utility.ExcelUtils;
//import utility.Log;

public class Login extends appModules.BaseClass {

	
	 //protected static final TimeUnit SECONDS = null;

	private static final TimeUnit SECONDS = null;
	//private static String Classpackname = this.getClass().getName();
	
	@Test(testName ="Test Internet Connection before login")
	 public static void test_Internet_Connection_Before_Login() throws Exception {
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	 
			//Login_Page.slider_bar_company(driver).click();
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			Login_Page.snackbar_before_login(driver).isDisplayed();
			Login_Page.snackbar_action_before_login(driver).isDisplayed();
			String text_Snackbar = Login_Page.snackbar_before_login(driver).getText();
			String text_action_Snackbar = Login_Page.snackbar_action_before_login(driver).getText();
			System.out.println(text_Snackbar);
			System.out.println(text_action_Snackbar);
			Assert.assertEquals(text_Snackbar, "No Internet Connection");
			Assert.assertEquals(text_action_Snackbar, "Try Again");
		   
		 
	    	 	
	     }
	     
	     catch (TimeoutException toe){
	    	 	toe.printStackTrace();
			
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

	/*@Test(testName ="Test successful Login")
	 public static void test_Successful_Login_Correct_Email_Correct_Password() throws Exception {
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	 
	    	// ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		     // String sUserName = ExcelUtils.getCellData(1, 1);
		     // String sPassword = ExcelUtils.getCellData(1, 2);
		     // getSheetAt(0).getRow(1).getCell(2);
		     // wb.getSheetAt(0).getRow(9).getCell(4); 
		      //System.out.println("\n " + sUserName);
		     // System.out.println("\n " + sPassword);
		      
	    	//Login_Page.input_field_email(driver).clear();
			//Login_Page.input_field_email(driver).sendKeys(sUserName);
			//Log.info(sUserName + " Username entered successfully");
			//Login_Page.input_field_password(driver).clear();
			//Login_Page.input_field_password(driver).sendKeys(sPassword);
			//Log.info(sPassword + " Password entered successfully");
			//Login_Page.button_login(driver).click();
			Login_Page.slider_bar_company(driver).click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			Login_Page.snackbar_login_panel(driver).isDisplayed();
			String text_Snackbar = Login_Page.snackbar_login_panel(driver).getText();
			Assert.assertEquals(text_Snackbar, "Company Selected");
		    //wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//li[contains(.,'These credentials do not match our records.')]"), "These credentials do not match our records."));
	    	Login_Page.input_field_email(driver).sendKeys("atlast@yopmail.com");
	    	Login_Page.input_field_password(driver).sendKeys("sakib007");
	    	Login_Page.button_login(driver).click();
	    	
		    Login_Page.progress_bar_login(driver).isDisplayed();
		    
		    //WebDriverWait wait = new WebDriverWait(driver, 20);
		    
	    	 
			
	     }
	     
	     catch (TimeoutException toe){
	    	 	toe.printStackTrace();
			
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
	
	      
	}*/
	
	

	 
	 
}
