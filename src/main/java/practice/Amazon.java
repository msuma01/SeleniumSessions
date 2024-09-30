package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		//Utilitybrowserpractice bs= new Utilitybrowserpractice();
//		//bs.launchbrowser("Firefox");
//		bs.Enterurl("https://www.amazon.com");
//		if(bs.getPageTitle().equals("Amazon.com. Spend less. Smile more.")) {
//			System.out.println("Correct title");
//		}else
//			System.out.println("Incorrect title");
//		System.out.println(bs.getPageTitle());
//		System.out.println(bs.getcurrenturl());
		
		//to print all the footer links in the page
		driver.get("https://www.flipkart.com/");
		
		Utility_Elements_Practice ut = new Utility_Elements_Practice(driver);
	By Loginlink = By.xpath("//span[text()='Login']");
		ut.doClick(Loginlink);
		
		By Footerlinks = By.xpath("//div[@class='bowO0w']//a");
		List<WebElement> Alllinks = ut.getElements(Footerlinks);
		int link=Alllinks.size();
		List<String> allString = ut.getElementsTextList(Footerlinks);
		for(WebElement e: Alllinks ) {
			String all = e.getText();
			System.out.println(all);
		}
		
		
		//bs.closebrowser();
	
		
		//Test
//		WebElement Search = bs.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		Search.clear();
//		Search.sendKeys("Nothing CMF1");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'CMF BY NOTHING Phone 1 5G (128 GB) (6 GB RAM) (Blu')]")).click();
//		
		

	}

}
