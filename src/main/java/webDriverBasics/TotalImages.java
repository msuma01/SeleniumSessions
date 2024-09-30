package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> ImagesList = driver.findElements(By.tagName("img"));
		int Total = ImagesList.size();
		System.out.println("Total number of Images===> "+Total);
//		for(WebElement e : ImagesList) {
//			
//			System.out.println(e.getText());  //Images are not having any text
//		}
		for(WebElement e: ImagesList) {
		String value = e.getAttribute("src");
		System.out.println(value);
		}
		
		//Capture all the links 
		//print the link text and href values
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links======>"+linkslist.size());
		
		for(WebElement e: linkslist) {
			String hrefs = e.getAttribute("href");
			String text = e.getText();
			System.out.println(text+" : "+hrefs);
		}
		//WebScraping
	}
	
	

}
