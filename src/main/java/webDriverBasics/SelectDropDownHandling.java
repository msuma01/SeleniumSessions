package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		//dropdown----> Html tag-> Select tag
		//Use Select Class in Selenium
		//Select---> Options
		driver = new ChromeDriver();
		ElementUtil_6 el = new  ElementUtil_6(driver);
		 
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		driver.manage().window().maximize();
		
	By countrydropdown = By.id("Form_getForm_Country");
		WebElement country = driver.findElement(countrydropdown);
		Select sel = new Select(country);
//		//sel.selectByVisibleText("india");// Case Sensitive:
//		sel.selectByVisibleText("India");
//		//sel.selectByIndex(9); //month, day
//		//sel.selectByValue("Cote D'Ivoire");

//		selectDropdownByVisibleText(countrydropdown, "Costa Rica");
//		selectDropdownByIndex(countrydropdown, 10);
//		selectDropdownByValue(countrydropdown, "Lebanon");
	//	getDropdownOptionsCount(countrydropdown);
		System.out.println(el.getDropdownOptionsCount(countrydropdown)-1);
	}
	public static void getDropdownOptionsCount(By locator) {
		WebElement sele = getElement(locator);
		Select se = new Select(sele);
		List<WebElement> alloptionsdropdown = se.getOptions();
		int len = alloptionsdropdown.size();
		System.out.println(len);
	}
public static void selectDropdownByVisibleText(By locator, String visibletext) {
	WebElement sele = getElement(locator);
	Select se = new Select(sele);
	se.selectByVisibleText(visibletext);
}
public static void selectDropdownByIndex(By locator, int index) {
	WebElement sele = getElement(locator);
	Select se = new Select(sele);
	se.selectByIndex(index);
}
public static void selectDropdownByValue(By locator, String Value) {
	WebElement sele = getElement(locator);
	Select se = new Select(sele);
	se.selectByValue(Value);
}


public static WebElement  getElement(By locator) {
	return driver.findElement(locator);
}
}
