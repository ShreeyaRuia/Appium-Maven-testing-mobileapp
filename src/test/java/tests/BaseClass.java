package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
AppiumDriver<MobileElement> driver;
	
@BeforeTest
public void setup()
{
 try
 {
  DesiredCapabilities caps= new DesiredCapabilities();
  caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
  caps.setCapability(MobileCapabilityType.DEVICE_NAME,"MOTO G5s plus");
  caps.setCapability(MobileCapabilityType.UDID,"ZY32299PX4");
  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
  caps.setCapability("appPackage","com.google.android.calculator");
  caps.setCapability("appActivity","com.android.calculator2.Calculator");	
  URL url = new URL("http://0.0.0.0:4723/wd/hub");
  driver = new AppiumDriver<MobileElement>(url, caps);
  }catch(Exception exp)
  {}
 }
 @Test
 public void sampleTest()
 {
  System.out.println("I am inside sample Test");
 }
 
 
 @AfterTest
 public void teardown()
 {
	 
 }
}
