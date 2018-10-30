package Applaunch;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;




public class Applogin {
	
	public class Demomobile {
	//sample1@user1.com
		WebDriver driver;
		@Test
		@SuppressWarnings("deprecation")
		public void mobiletest() throws MalformedURLException{
			
			DesiredCapabilities cap=new DesiredCapabilities();
			/*cap.setCapability("deviceName", "OnePlus 6");
			cap.setCapability(CapabilityType.BROWSER_VERSION, "");
			cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(CapabilityType.VERSION, "9");
			cap.setCapability("appPackage", "com.pearson.android.readerplus.dev");
			cap.setCapability("appActivity","com.pearson.android.readerplus.MainActivity");*/
			
			
			//Runtime.getRuntime().exec(adb shell am start -n io.appium.unlock/.Unlock);
			//DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability("deviceName", "kishore");
			cap.setCapability(CapabilityType.BROWSER_VERSION, "");
			cap.setCapability(CapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(CapabilityType.VERSION, "5");
			cap.setCapability("appPackage", "com.pearson.android.readerplus.dev");
			cap.setCapability("appActivity","com.pearson.android.readerplus.MainActivity");
			
			
			driver=new io.appium.java_client.android.AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.id("com.pearson.android.readerplus.dev:id/usernameEdit")).sendKeys("sample1@user1.com");
			driver.findElement(By.id("com.pearson.android.readerplus.dev:id/loginButton")).click();
			driver.findElement(By.id("com.pearson.android.readerplus.dev:id/passwordEdit")).sendKeys("hudson102");
			driver.findElement(By.id("com.pearson.android.readerplus.dev:id/loginButton")).click();
			driver.findElement(By.id("More options")).click();
			//driver.findElement(By.id("com.pearson.android.readerplus.dev:id/title[3]")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")).click();
			//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView")).click();
		}
		
	}


}
