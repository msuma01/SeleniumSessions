package webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct Tile---Pass");
		}else
		{
			System.out.println("Incorrect title--- Fail");
		}
		
		
		driver.quit();
		//driver.close();
		driver = new ChromeDriver();
		driver.get("https://www.google.com"); //Session Id =null, No such session exception

	}

}
