package webDriverBasics;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopup {
	 static WebDriver driver;
	 public static void main(String[] args) throws Throwable {
		 
		 String username="admin";
		 String Password= "admin";
		//JS alerts:
	WebDriver driver = new ChromeDriver();
	driver.get("https://"+username+":"+Password+"@"+"the-internet.herokuapp.com/basic_auth");
	//Limitation:in the url only one@ is allowed

	//Selenium 4.x: HasAuthenticated feature: later
	
	//driver.get("https://"+username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
	
			//Auth pop ups are not JS alerts
			// can not switch to auth pop ups
			
			//Selenium 4.x: HasAuthenticated:
			((HasAuthentication)driver).register(()-> new UsernameAndPassword(username, Password));// only for chromium driver
			
			
//			HasAuthentication hs= (HasAuthentication)driver;
//			hs.register(new UsernameAndPassword(username, Password));
			
			//only for chromiumdriver: chrome/edge
	//AutoIT/Robot Class/Sikuli: windows os, 
			//linux/mac/headless/cloud/grid/aws/CIcd/jenkins
			
			
//			//recaptcha:
			//1. no automation
			//2. QA/Dev/Stage: disable captcha
			//3. hard code the captcha value in QA/dev 
			
	
	 }
	 }