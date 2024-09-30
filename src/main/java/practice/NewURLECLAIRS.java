package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewURLECLAIRS {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		System.out.println(eclairspage());
		

	}

	public static List<String> eclairspage() {
		List<WebElement> allElements = driver.findElements(By.xpath("//tr[@class='ng-star-inserted']/td"));
		List<String> allstring = new ArrayList<String>();
		int size= allElements.size();
		System.out.println(size);
		for(WebElement e: allElements) {
			
		String text = e.getText();
		allstring.add(text);
			
		}
		return allstring;
	}
	
}
