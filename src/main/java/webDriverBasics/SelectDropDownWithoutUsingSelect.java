package webDriverBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelect {
	static WebDriver driver;
	//get all the options using select and without select class
	//select a country
	//
	public static void main(String[] args) {
		
			driver = new ChromeDriver();	 
			driver.get("https://www.orangehrm.com/30-day-free-trial/");
			driver.manage().window().maximize();
			
			By CountryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
			selectDropdownValue(CountryOptions, "Austria");
			
			//return textlist;
	}
	public static void selectDropdownValue(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		List<String> textlist = new ArrayList<String>();
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList) {
			String st = e.getText();
			System.out.println(st);
			//textlist.add(st);
			if(st.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
