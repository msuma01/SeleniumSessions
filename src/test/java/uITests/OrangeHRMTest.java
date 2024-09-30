package uITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest {
	

	
	@Test (priority=1)
	public void getPageTitleTest() {
//		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "30-Day Advanced Free Trial | OrangeHRM");
	}
	
	@Test (priority=2)
	public void getPageURL() {
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertTrue(actualurl.contains("orangehrm"));
	}
	
	
	
}
