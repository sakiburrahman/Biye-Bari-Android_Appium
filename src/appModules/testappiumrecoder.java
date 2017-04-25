package appModules;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class testappiumrecoder {
	public static AndroidDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
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

	}

}
