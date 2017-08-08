/**
 * 
 */
package appiumNew;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/**
 * @author Kalai
 *
 */
public class AppiumServerwithjavacode {
	
	AppiumDriver<MobileElement> driver;
	AppiumDriverLocalService service;
	
	public void setcap(){
		
		service= AppiumDriverLocalService.buildDefaultService();
		service.start();
		System.out.println("session started");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("app", System.getProperty("user.dir")+"//app//WhatsApp.apk");
		
		driver= new AndroidDriver<MobileElement>(service.getUrl(), cap);
		System.out.println("running now");
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppiumServerwithjavacode obj = new AppiumServerwithjavacode();
		obj.setcap();

	}

}
