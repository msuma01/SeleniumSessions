package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;
	
	@Parameters({"url" ,"browser"})
	@BeforeTest
		//public void setUp(@Optional("https://www.google.com")String url,@Optional("chrome") String browser) 
		public void setup(String url, String browser)
				{
		System.out.println("Bowser name: "+browser);
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();

			break;
		case "firefox":
			driver = new FirefoxDriver();

			break;
		case "edge":
			driver= new EdgeDriver();

			break;

		default:
			System.out.println("Please Pass the right Browser: "+browser);
			throw new IllegalArgumentException("WRONG BROWSER"+browser);
			
		}
			//driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
	

	@AfterTest
	//@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
