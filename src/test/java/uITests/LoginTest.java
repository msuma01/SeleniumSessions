package uITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{
	
	
	//AAA 
	//test:only one assertion
	
	@Test (priority=1)
	public void getPageTitleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Account Login");
	}
	
	@Test (priority=2)
	public void getPageURL() {
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertTrue(actualurl.contains("route=account/login"));
	}
	
	@Test (priority=3)
	public void PageLOGOTest() {
		
		Assert.assertTrue (driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
	}
	
	
}
