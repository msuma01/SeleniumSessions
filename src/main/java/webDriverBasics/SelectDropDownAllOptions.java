package webDriverBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {
			static WebDriver driver;
	public static void main(String[] args) {
		//dropdown----> Html tag-> Select tag
				//Use Select Class in Selenium
				//Select---> Options
				driver = new ChromeDriver();
				driver.get("https://www.orangehrm.com/30-day-free-trial/");
				driver.manage().window().maximize();
				
				By countrydropdown = By.id("Form_getForm_Country");
					//single country validation
						if(getDropDownOptionsTextList(countrydropdown).contains("India")) {
							System.out.println("PASS");
							
						}
					//multiple countries	
					List<String> expectedCountryList = Arrays.asList("India","Australia","Austria");
						if(expectedCountryList.containsAll(expectedCountryList)) {
							System.out.println("PASS");
						}
						}
					
	

	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select sel =  new Select(getElement(locator));
		List<WebElement> listOptions = sel.getOptions();
		System.out.println(listOptions.size());
		
		List<String> Alloptionstext = new ArrayList<String>();
		for(WebElement e: listOptions) {
			String alltext = e.getText();
			 Alloptionstext.add(alltext);
					
	}
		return Alloptionstext;
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
