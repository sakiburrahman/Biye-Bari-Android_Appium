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

public class SignUp extends appModules.BaseClass {
	
	private static final TimeUnit SECONDS = null;
	
	@Test(testName ="Test Sign Up Link")
	public static void test_sign_up_linkd() throws Exception {
		
		
		//String Workdir = System.getProperty("user.dir");
		//String className = new Object(){}.getClass().getName();
		//ExcelUtils.setExcelFile(Constant.Path_Test_Output + Constant.File_Test_Output,"Sheet1");
		
	     try {
	    	 
			//Login_Page.slider_bar_company(driver).click();
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			SignUp_Page.link_sign_up(driver).isDisplayed();
			String text_Sign_Up = SignUp_Page.link_sign_up(driver).getText();
			System.out.println(text_Sign_Up);
			Assert.assertEquals(text_Sign_Up, "Sign Up Now");
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
