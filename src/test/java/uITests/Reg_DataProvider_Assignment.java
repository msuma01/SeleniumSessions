package uITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class Reg_DataProvider_Assignment extends BaseTest {

	@DataProvider
	public Object[][] fillRegister(){
			return new Object[][]{
				{ "Purna","Hani" , "Hani12345@gmail.com","57834792","Ghana"},
				{ "Heroine", "Pencil", "Pencil65784@gmail.com","64809389998","TightLeft"},
				{ "Jassu", "Yamini", "jasssu22334@gmail.com", "3456756745", "jasminerumani" }
				
		
	};
	
}
	@Test (dataProvider="fillRegister")
	public void filldata(String name, String lastname, String email, String phone, String Password) {
		
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys(phone);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.cssSelector("input.btn")).click();
		
		String Message = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		Assert.assertEquals(Message,"Your Account Has Been Created!");
		driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		
		/*
		 * <test name="RegFill Test">
		<parameter name="url" value="https://naveenautomationlabs.com/opencart/index.php?route=account/register" />
		<parameter name="browser" value="Firefox"/>
		<classes>
			<class name="uITests.Reg_DataProvider_Assignment" />
		</classes>
		 */
		
		
		
		
		//Original
/*<test name="OpenCartSearch Test">
		<parameter name="url" value="https://naveenautomationlabs.com/opencart/index.php?route=account/login" />
		<parameter name="browser" value="Firefox"/>
		<classes>
			<class name="uITests.OpenCartLoginPageTest" />
		</classes>
		</test>
 * 
 */
		
	}
	 
}