package appiumNew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Whatsappcode {

	AndroidDriver<MobileElement> driver;


	public void setcapability() throws MalformedURLException{
		System.out.println("session starting");

		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("noReset", "true");
		cap.setCapability("appPackage", "com.whatsapp");
		cap.setCapability("appActivity", "com.whatsapp.HomeActivity");
		driver=new AndroidDriver<MobileElement>((new URL("http://0.0.0.0:4723/wd/hub")), cap);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("session created");
	}
	public void allowAppPermission(){
		while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		{  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		}
	}

	public void scrollToExactText(String scrollText){

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + scrollText + "\").instance(0));").click();
	}

	public int Getrowcount(){
		int rows=0;
		try{
		List<MobileElement> element= driver.findElements(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'com.whatsapp:id/contact_row_container')]"));
		rows=element.size();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return rows;
	}
	
	@SuppressWarnings("deprecation")
	public void verticalswipe(){

		Dimension dim= driver.manage().window().getSize();
		int height= dim.getHeight();
		int width=dim.getWidth();	
		int x= width/2;
		int start=(int)(height*0.60);
		int end=(int)(height*0.10);
		driver.swipe(x, start, x, end, 300);

	}
	
	public void SendMessage(String Message){
		
		MobileElement Messages=driver.findElement(By.xpath("//android.widget.EditText[@text='Type a message']"));
		Messages.clear();
		Messages.sendKeys(Message);
		
	}

	public void f() throws InterruptedException {

		System.out.println("inside the method");
		Thread.sleep(2000);
		String createAccount_H="//android.widget.TextView[@text='WhatsApp']";
		String newMessageIcon_BTN="com.whatsapp:id/fab";
		String NewMessagePaheVerify_H="//android.widget.TextView[@text='Select contact']";
		String ContactName="//android.widget.TextView[@text='Cable maari']";

		verticalswipe();
		int total=Getrowcount();
		System.err.println(total);
		WebElement header= driver.findElementByXPath(createAccount_H);
		if(header.getText().equals("WhatsApp")){
			System.out.println("text is matched so passed");
		}
		driver.findElementById(newMessageIcon_BTN).click();

		WebElement headerText= driver.findElementByXPath(NewMessagePaheVerify_H);
		if(headerText.getText().equals("Select contact")){
			System.out.println("Inside the select contact page");
		}		
		scrollToExactText("Kutty Darling");	
		
		SendMessage("hi dear, how are you$$$$");
		
		driver.findElementById("com.whatsapp:id/send").click();
		
		//android.widget.ImageButton[contains(@resource-id,'com.whatsapp:id/send')]

	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		Whatsappcode obj= new Whatsappcode();
		obj.setcapability();
		obj.f();

	}	
}
