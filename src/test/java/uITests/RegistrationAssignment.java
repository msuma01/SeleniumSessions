package uITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegistrationAssignment extends BaseTest {
	
	
	@Test (priority=1)
	public void Registration() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Register Account");
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Ananya");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Priya");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Ananya2345@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("763547834587934759327");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("JaiJai");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("JaiJai");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn")).click();
		
		String Message = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Assert.assertEquals(Message,"Your Account Has Been Created!");
		
	
	}


}
