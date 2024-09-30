package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick_6 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//click: button, link, checkbox, radiobutton, image
		
				driver = new ChromeDriver();
				driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				
				//create web element (FE) + perform action(click)
				
				//html tag: <a>only for links: 
//				driver.findElement(By.linkText("Login")).click();
//				driver.findElement(By.linkText("Register")).click();
//				driver.findElement(By.name("agree")).click();
				
				By loginLink = By.linkText("Login");
				By registerLink = By.linkText("Register");
				By agreeCheckBox = By.name("agree");
				
				doClick(loginLink);
				doClick(registerLink);
				doClick(agreeCheckBox);
				
			}
			
			public static void doClick(By locator) {
				getElement(locator).click();
			}
			
			
			public static WebElement getElement(By locator) {
				return driver.findElement(locator);
			}
	}


