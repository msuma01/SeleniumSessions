package webDriverBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingBrowsers {

	public static void main(String[] args) {
		//Open Chrome Browser
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91913\\Downloads\\My Drivers\\chromedriver.exe");
         	ChromeDriver driver = new ChromeDriver();
				//open firefox
				//FirefoxDriver driver = new FirefoxDriver();
				//Open EdgeDriver
				//EdgeDriver driver = new EdgeDriver();
				//enter Url
				driver.get("https://google.com");
				//get the title
				String title = driver.getTitle();
				System.out.println(title);
				// actual vs expected : Validation/ checkpoint
				if(title.equals("Google")) {
					System.out.println("Correct Tile---Pass");
				}else
				{
					System.out.println("Incorrect title--- Fail");
				}
				
				// Automation steps+ validation point ---> Automation testing
				//Close the browser
				driver.quit();
				

	}

}
