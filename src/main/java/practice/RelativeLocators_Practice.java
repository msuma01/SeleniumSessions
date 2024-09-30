package practice;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators_Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(3000);
	WebElement city = driver.findElement(By.linkText("Peace River, Canada"));
	
	 String rank = driver.findElement(with(By.tagName("p")).toLeftOf(city)).getText();
	 	System.out.println(rank);
	 	String AQI = driver.findElement(with(By.tagName("p")).toRightOf(city)).getText();
	 	System.out.println(AQI);
	 	String ele = driver.findElement(with(By.tagName("p")).below(city)).getText();
	 	System.out.println(ele);
	 	String above = driver.findElement(with(By.tagName("p")).above(city)).getText();
	 	System.out.println(above);
	 	String near = driver.findElement(with(By.tagName("a")).near(city)).getText();
		System.out.println(near);
	 	
	}

}
