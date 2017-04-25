package appModules;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Setting;
import io.appium.*;

public class BaseClass {
//public static WebDriver driver;
public static AndroidDriver driver;

@BeforeMethod
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities().android();
	capabilities.setCapability("deviceName","V40150508010590");
	//ce04160489f1cb3202
	//emulator-5554
	
	capabilities.setCapability("VERSION", "4.1.1"); 
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	
	
	capabilities.setCapability("platformName","Android");
	
	//capabilities.setCapability("appPackage", "com.sec.android.app.camera");
	//capabilities.setCapability("appActivity", "com.sec.android.app.camera.camera");
	
	//Used Only For Emulator
	//capabilities.setCapability("appPackage", "com.android.calculator2");
	//capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	//Used Only for real devices
	capabilities.setCapability("app", "C:/Users/SAKIB/workspace/AppiumTest/TestApps/Biye Bari.apk");
	
	driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	System.out.println("*******************");
	System.out.println("launching Android Phone");
   
  // capabilities.setCapability("appPackage", "com.bit_makers.biyebarinew");
// This package name of your app (you can get it from apk info app)
	//capabilities.setCapability("appActivity","com.bit_makers.biyebarinew.Activity.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
	//capabilities.setCapability("app", application.getAbsolutePath());
	//capabilities.setCapability("automationName", "appium");
   // capabilities.setCapability("noRest", true);
	
	//WebElement allowButton=driver.findElement(By.name("Allow"));
	  // allowButton.click();
	
	
	
}

@Test
public void testLogin() throws Exception {
   //locate the Text on the calculator by using By.name()
   //WebElement email_Input_Field=driver.findElement(By.id("login_email"));
   //email_Input_Field.click();
  // email_Input_Field.sendKeys("atlast@yopmail.com");
   //WebElement password_Input_Field=driver.findElement(By.id("login_password"));
  // password_Input_Field.click();
  // password_Input_Field.sendKeys("sakib007");
  // WebElement login_Button= driver.findElement(By.id("login_btn"));
  // login_Button.click();
	



}

/*@Test
public static <UiObject, UiDevice> void assertViewWithTextIsVisible(UiDevice device, String text) {  
    UiObject allowButton = device.findObject(new UiSelector().text(text));
    if (allowButton).()) {
        throw new AssertionError("View with text <" + text + "> not found!");
    }
}
*/

@AfterMethod
public void teardown() throws Exception {
	//close the app
	driver.quit();
}
}
