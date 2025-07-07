package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMPROStream {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		List<WebElement> List= driver.findElements(By.cssSelector("section#details h3"));
		List.stream().forEach(e -> System.out.println(e.getText()));

	}

	public static void getHeaderList() {
		
	}
	public static void printHeadersList() {
		
	}
}
