package webDriverBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Util_9 {
static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// By images = By.tagName("img");
		 By alllinks = By.tagName("a");
//		 int ImagesCount =getElements(images).size();
//		 System.out.println(ImagesCount);
//		 
//		int LinkCount = getElements(alllinks).size();
//		System.out.println(LinkCount);
		// System.out.println(getElementsCount(images));
		 //System.out.println(getElementsCount(alllinks));
   		List<String> Text = getElementsTextList(alllinks);
   		//System.out.println(Text);
   		System.out.println(Text.contains("About Us"));
   		printElementList(alllinks);

	}
	
	public static void printElementList(By locator) {
		List<String> list = getElementsTextList(locator);
		for(String e: list) {
			System.out.println(e);
		}
		
	}

	public static List<WebElement>  getElements(By locator) {
		return driver.findElements(locator);
		
		
}
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
		
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> EleList = getElements(locator);
		List<String> EleTextList = new ArrayList<String>();
		for(WebElement e : EleList) {
			String AllText = e.getText();
			if(AllText.length()!=0) {
				EleTextList.add(AllText);
			}
		}
		return EleTextList;
	}



}