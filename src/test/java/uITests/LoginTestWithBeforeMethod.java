package uITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithBeforeMethod {
	WebDriver driver;
//@BeforeTest
	@BeforeMethod
	public void setUp() {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void getPageTitleTest() {
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Account Login");
	}
	
	@Test
	public void getPageURL() {
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		Assert.assertTrue(actualurl.contains("route=account/login"));
	}
	
	@Test
	public void PageLOGOTest() {
		
		Assert.assertTrue (driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
	}
	
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
