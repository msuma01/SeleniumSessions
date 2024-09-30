package uITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class OpenCartLoginPageTest extends BaseTest {
	

	//data driven approach: fetch the data from data providers:testng DP,excel, csv,json
	//parameterization of testcases
	
	
	@DataProvider
	public Object[][] getSearchData() {
	  return new Object[][] 
			  {
		  {"macbook", "MacBook Pro"},
		  {"imac", "iMac"},
		  {"samsung" , "Samsung Galaxy Tab 10.1"},
		  {"samsung" , "Samsung SyncMaster 941BW"}
	  };
	}
	
	
	@Test(dataProvider = "getSearchData")
	public void searchTest(String searchKey,String ProductName ) {
		driver.findElement(By.cssSelector("input.input-lg")).clear();
		driver.findElement(By.cssSelector("input.input-lg")).sendKeys(searchKey);
		driver.findElement(By.cssSelector("i.fa-search")).click();
		driver.findElement(By.linkText(ProductName)).click();
		String header=driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(header, ProductName);
		
	}

}

