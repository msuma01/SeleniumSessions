package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		 ElementUtil_6 eu= new ElementUtil_6(driver);
		eu.doSearch(searchField, suggestions, "Selenium", "doctor");
		
	}
	
	
}