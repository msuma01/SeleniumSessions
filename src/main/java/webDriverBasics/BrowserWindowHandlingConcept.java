package webDriverBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandlingConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Executive Profile']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
		
		//1.fetch the window ids for Parent and child windows
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window ID is: "+parentWindowID);
		String ChildwindowID = it.next();
		System.out.println("Child Window ID is: "+ChildwindowID);
		
		//2.Switching work
		driver.switchTo().window(ChildwindowID);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();// driver is lost // No Such Window Exception
		driver.switchTo().window(parentWindowID);//parentwindow
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();

	}

}
