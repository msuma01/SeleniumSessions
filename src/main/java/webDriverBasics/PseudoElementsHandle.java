package webDriverBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsHandle {

	public static void main(String[] args) {
		
		//::before
		//::after
		//::has
		//
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String JSPath = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content')";
// window.getComputedStyle(document.querySelector('label[for="input-firstname"]'), '::before').getPropertyValue('color');
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String ele= js.executeScript(JSPath).toString();
		System.out.println(ele);
	
		if(ele.contains("*")) {
			System.out.println("Firstname is the mandaroey field");
		}
		
	}

}
