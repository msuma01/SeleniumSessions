package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleElements {

	public static void main(String[] args) {
		//Single element----> Find Element
		//Multiple Elements----> Find Elements
		//total links
		//print text of each link
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		int totallinks =linkslist.size();
		System.out.println("Total links======>" +totallinks);
		
		for(int i=0;i<totallinks; i++ ) {
			
			String list = linkslist.get(i).getText();
			if(list.length()!=0) {
			System.out.println(i+" "+ list);
			}
		}
		
		
		//Assignment: Links without blank test
		int Count =0;
		for(int i =0;i<totallinks;i++ ) {
			String text = linkslist.get(i).getText();
			if(text.length()!=0) {
				System.out.println(i+" "+ text);
				Count++;
				
				}
				
			
		}
		
		System.out.println("The Number of Links without blank texts:"+Count);
	//// Assignment2: links with blank text 
		int Count3 = totallinks-Count;
		System.out.println("The number of Links with Blank Texts:"+Count3);
		
		
		// Assignment2: Links with blank text
		int Count2 =0;
		for(int i =0;i<totallinks;i++ ) {
			String text = linkslist.get(i).getText();
			if(text.length()==0) {
				
				Count2++;
				
			}
	}System.out.println("The number of Links with Blank texts: " +Count2);
		
		System.out.println("-------------------------------------For each loop");
		//Foreach
		int Count1=0;
		for(WebElement e : linkslist) {
			String text = e.getText();
			if(text.length()!=0) {
				System.out.println(Count1 +" = "+text);
				
		}
		Count1++;	
	}
	
	}
}
