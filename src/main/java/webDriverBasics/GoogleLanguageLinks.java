package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> LanguageLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		System.out.println(LanguageLinks.size());
		
		for(WebElement e: LanguageLinks ) {
			String LanguageText = e.getText();
			System.out.println(LanguageText);
			if(LanguageText.contains("తెలుగు")) {
				e.click();
				break;
			}
		}
	}

}
