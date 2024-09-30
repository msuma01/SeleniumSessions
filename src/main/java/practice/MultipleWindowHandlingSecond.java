package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandlingSecond {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		
		WebElement ExecutiveProfile = driver.findElement(By.xpath("//a[normalize-space()='Executive Profile']"));
		WebElement PrivacyPolicy= driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']"));
		WebElement NewsArticles = driver.findElement(By.xpath("//div[@class='footer-main']//a[normalize-space()='News Articles']"));
		WebElement OpenSourceHRMS = driver.findElement(By.xpath("//div[@class='footer-main']//a[normalize-space()='Open Source HRMS']"));
		//1. Parent to child1
		Actions act = new Actions(driver);
		act.click(ExecutiveProfile).perform();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent window ID is: "+parentWindowID);
		String ChildwindowID = it.next();
		System.out.println("Child Window ID is: "+ChildwindowID);
		
		//2.Switching Parent window
				driver.switchTo().window(ChildwindowID);
				String title=driver.getTitle();
				System.out.println(title);
				driver.close();// driver is lost // No Such Window Exception
				driver.switchTo().window(parentWindowID);//parentwindow
				String url=driver.getCurrentUrl();
				System.out.println(url);
		//3.Clicking on Element 2 and switch to child2
				act.click(PrivacyPolicy).perform();
				
				Set<String> handles2 = driver.getWindowHandles();
				Iterator<String> it2 = handles2.iterator();
				String ParentID2 = it2.next();
				System.out.println(ParentID2);
				  String ChildwindowID2 = it2.next();
				driver.switchTo().window(ChildwindowID2);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentWindowID);
		//4.Clicking on Element 3 and switch to child3
				act.click(NewsArticles).perform();
				
				Set<String> handles3 = driver.getWindowHandles();
				Iterator<String> it3 = handles3.iterator();
				String ParentID3 = it3.next();
				System.out.println(ParentID3);
				  String ChildwindowID3 = it3.next();
				driver.switchTo().window(ChildwindowID3);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentWindowID);
		//5.Clicking on Element 4 and switch to child 4
                act.click(OpenSourceHRMS).perform();
				
				Set<String> handles4 = driver.getWindowHandles();
				Iterator<String> it4 = handles4.iterator();
				String ParentID4 = it4.next();
				System.out.println(ParentID4);
				  String ChildwindowID4 = it4.next();
				driver.switchTo().window(ChildwindowID4);
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().window(parentWindowID);
				System.out.println(driver.getTitle());
				driver.quit();

	}
}
