package uITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest{

	

	@Test(priority=1)
	public void getPageTitleTest() {
		//driver.get("https://www.google.com/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Google");
	}
	
	@Test (priority=2)
	public void getPageURL() {
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertTrue(actualurl.contains("google"));
	}
	
	
	
	
}
