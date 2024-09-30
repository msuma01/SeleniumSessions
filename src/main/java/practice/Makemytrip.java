package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//open firefox
		//FirefoxDriver driver = new FirefoxDriver();
		//Open EdgeDriver
		//EdgeDriver driver = new EdgeDriver();
		//enter Url
		driver.get("https://www.makemytrip.com");
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		// actual vs expected : Validation/ checkpoint
		if(title.equals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday")) {
			System.out.println("Correct Tile---Pass");
		}else
		{
			System.out.println("Incorrect title--- Fail");
		}
		
		//Test
		
		
		WebElement loginPopup = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
       if(loginPopup.isDisplayed())
    	   System.out.println("Popup is displayed");
       else {
    	   System.out.println("Popup is not displayed, click on the Login button");
       }
    //   driver.switchTo().
       
      // driver.findElement(By.xpath("//span[@id='button-label']")
		// Automation steps+ validation point ---> Automation testing
		//Close the browser
		driver.quit();
		

	}

}
