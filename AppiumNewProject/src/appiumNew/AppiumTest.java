package appiumNew;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTest {
	AppiumDriver<AndroidElement> driver;


	public void setcapability() throws MalformedURLException{
		System.out.println("session starting");

		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", "true");
		cap.setCapability("appPackage", "com.whatsapp");
		cap.setCapability("appActivity", "com.whatsapp.HomeActivity");
		//		cap.setCapability("app",path+"\\app\\WhatsApp.apk"); 
		driver=new AndroidDriver<AndroidElement>((new URL("http://0.0.0.0:4723/wd/hub")), cap);
		System.out.println("session created");
	}
	public void allowAppPermission(){
		while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		{  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		}
	}

	public void f() throws InterruptedException {

		System.out.println("inside the method");
		Thread.sleep(4000);

		//		WebElement name= driver.findElement(By.id("com.phonepe.app:id/introduction_get_started"));
		//		System.out.println("nae will be "+name.getText());
		//		
		//		
		//		driver.findElement(By.id("com.phonepe.app:id/introduction_get_started")).click();
		//		

		String createAccount_H="//android.widget.TextView[@text='Create PhonePe Account']";

		String phoneNumField_TXT="com.phonepe.app:id/et_phone_number";
		String FullName_TXT="com.phonepe.app:id/et_user_name";

		//		if(driver.findElement(By.id("com.phonepe.app:id/introduction_get_started")).isDisplayed()){
		//			driver.findElement(By.id("com.phonepe.app:id/introduction_get_started")).click();
		//			allowAppPermission();
		//		}
		if(driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Create PhonePe Account']")).isDisplayed()){
			WebElement text= driver.findElement(By.xpath("//android.widget.TextView[@text='Create PhonePe Account']"));
			System.out.println("text will be"+text.getText());
			driver.findElement(By.id(phoneNumField_TXT)).click();
			driver.findElement(By.id(phoneNumField_TXT)).clear();
			driver.findElement(By.id(phoneNumField_TXT)).sendKeys("9789722455");

			driver.findElement(By.id(FullName_TXT)).click();
			driver.findElement(By.id(FullName_TXT)).clear();
			driver.findElement(By.id(FullName_TXT)).sendKeys("kalai");
		}


		//		if(name.getText().contains("Already have PhonePe Account? Sign In")){
		//			System.out.println("text matched continuing to sign In");
		//			WebElement name2= driver.findElement(By.xpath("//android.widget.TextView[@text='Welcome back!']"));
		//			if(name2.equals("Welcome back!")){
		//				System.out.println("my test is passed AWWWWWWWWWWWWWWWWWWOOOOOOOOOOOOOOOO!!!");
		//			}
		//		}


		//		boolean flag=false;
		//		for(int i=0; i<10; i++){
		//			try{
		//			driver.findElement(By.xpath("//android.widget.TextView[@text='Pay at Store']")).isDisplayed();
		//			flag=true;
		//			break;
		//			}catch(Exception e){
		//				verticalswipe();
		//			}
		//		}

		//		driver.findElementByAccessibilityId("To Contact").click();


		//		
		//		WebElement title=driver.findElementById("title");




		//		if(title.getText().contains("Kutty Daling")){
		//			System.out.println("text matched and hence its passed");
		//		} 
		//		
		//		driver.findElementById("com.whatsapp:id/contact_row_container").click();
		//		
		//		driver.closeApp();
	}

	//	@SuppressWarnings("deprecation")
	//	public void verticalswipe(){
	//		
	//		Dimension dim= driver.manage().window().getSize();
	//		int height= dim.getHeight();
	//		int width=dim.getWidth();	
	//		int x= width/2;
	//		int start=(int)(height*0.80);
	//		int end=(int)(height*0.20);
	//		driver.swipe(x, start, x, end, 300);
	//		
	//	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		AppiumTest obj= new AppiumTest();
		obj.setcapability();
		obj.f();

	}
}
