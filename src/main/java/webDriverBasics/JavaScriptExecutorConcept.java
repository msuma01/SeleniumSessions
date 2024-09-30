package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class JavaScriptExecutorConcept {
 static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//JavaScript Executorhttps://naveenautomationlabs.com/opencart/index.php?route=account/account
		
		//Java- JS Code---> JavaScriptExecutor (I)-->executescript(JS)
		WebDriver 	driver = new FirefoxDriver();
		//driver.get("https://classic.crmpro.com/");
		
		//Interface Casting WebDriver--> JavaScriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//		String title=js.executeScript("return document.title;").toString();
//         System.out.println(title);
//         
//         String url=js.executeScript("return document.URL;").toString();
//         System.out.println(url);
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
//		System.out.println(jsutil.getTitle());
//		System.out.println(jsutil.getURL());
//		jsutil.generateJSAlert("Iam the Alert Message");
//			//for UI Developers validation message
		
//		
//		String InnerText=jsutil.getPageInnerText();
//		System.out.println(InnerText);
//		if(InnerText.contains("Print & SMS")) {
//			System.out.println("PASS");
//		}
//		driver.get("https://www.google.com");
//		Thread.sleep(1000);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Thread.sleep(2000);
//		jsutil.gobackWithJs();
//		Thread.sleep(3000);
//		jsutil.goNextWithJS();
//		Thread.sleep(3000);
//		jsutil.goRefreshJs();
		Thread.sleep(2000);
	//	jsutil.zoomChromeEdgeSafariFirefox("400");
	//jsutil.scrollPageDown();
	//jsutil.scrollPageUp();
		//WebElement Element = driver.findElement(By.xpath("//input[@name='username']"));
		//jsutil.scrollIntoView(Element);
		Thread.sleep(2000);
		//jsutil.drawBorder(Element);
	//	jsutil.flash(Element);
	//	Element.sendKeys("srivalli@gmail.com");
		
		
		//Assignment: REgistration page flash
		
		WebElement e1=driver.findElement(By.cssSelector("input#input-firstname"));
		jsutil.flash(e1);
		e1.sendKeys("triya");
		
		WebElement e2=driver.findElement(By.xpath("//input[@id='input-lastname']"));
		jsutil.flash(e2);
		
		e2.sendKeys("group");
		
		WebElement e3=driver.findElement(By.cssSelector("input#input-email"));
		jsutil.flash(e3);
		e3.sendKeys("triya@gmail.com");
		WebElement e4=driver.findElement(By.cssSelector("input#input-telephone"));
		jsutil.flash(e4);
		e4.sendKeys("6876345789");
		
		WebElement e5=driver.findElement(By.cssSelector("input#input-password"));
		jsutil.flash(e5);
		e5.sendKeys("hinchu");
		WebElement e6=driver.findElement(By.cssSelector("input#input-confirm"));
		jsutil.flash(e6);
		
		e6.sendKeys("hinchu");
		
		
		
		
		
		
	}
	
	


}
