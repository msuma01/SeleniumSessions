package webDriverBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxes {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		
		//Parent to direct child:
		//form[@id='hs-login']//input[@id='username']
		
		// //form[@id='hs-login']/div -----> 8 (direct child elements)
		//form[@id='hs-login']//div  ------> 23 (direct + indirect elements)---->Descendant child elements
		
		//select[@id='Form_getForm_Country']/option------> direct ===233
		//select[@id='Form_getForm_Country']//option --------> Direct(233) + indirect(0) ===>233
		
		//select[@id='Form_getForm_Country']/descendant::option
		//select[@id='Form_getForm_Country']//option
		
		//Child to parent:
//		backward traversing in DOM:
		//input[@id='username']/../../../../../../../../../../../../..
		
		//immediate Parent
		//select[@id='Form_getForm_Country']/..
		//select[@id='Form_getForm_Country']/parent::div
		
		//Indirect Parent (Child to Ancestor)
		//input[@id='username']/ancestor::form --------->
		
		//input[@id='input-firstname']/ancestor::div[@class='container']
		
		//input[@id='input-password']/preceding::input[@id='input-email']
		
		//input[@id='input-email']/preceding-sibling::label
		
		
		
		
		//selecting the checkbox of WebTable
		//1. //a[text()='Joe.Root']/ancestor::tr//input
		//2.  //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
	//	driver.findElement(By.xpath(" //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//driver.findElement(By.xpath(" //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		SelectUser("Joe.Root");
		SelectUser("Jasmine.Morgan");
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Jasmine.Morgan"));;
		
		//100===>DM
		//input[@id='input-firstname']--> 20--->1
		//*[@id='input-firstname']----->100---->1
		
		
		
		//Assignment:
		//For Bowling:
		//th[text()='BOWLING']/ancestor::thead/following-sibling::tbody//span[text()='Paul Walter']//ancestor::td//following-sibling::td
		
		}
		
	
	public static List<String> getUserDetails(String User) {
		List<WebElement> UserDetails = driver.findElements(By.xpath("//a[text()='"+User+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList = new ArrayList<String>();
		for(WebElement e:UserDetails ) {
			String list = e.getText();
			userDetailsList.add(list);
			
	}
		return userDetailsList;
	}
	public static void SelectUser(String userName) {
		driver.findElement(By.xpath(" //a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
