package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSuggestions_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		 Utility_Elements_Practice ue = new  Utility_Elements_Practice(driver);
		 By searchfield = By.name("field-keywords");
		 
		 String name="in";
		 StringBuilder sb = new StringBuilder("black");
			StringBuffer sf = new StringBuffer("colour");
		 
		 By Suggestionlist = By.xpath("//div[@class ='s-suggestion-container']");
		//boolean value= ue.doSearch(searchfield, Suggestionlist, "Clips", "12");
		//boolean value2 = ue.doSearch(searchfield, Suggestionlist, "Sarees"+" "+ name+" " +sb+" "+sf, "Bhagalpuri");
		 boolean value2 = ue.doSearch(searchfield, Suggestionlist," Sarees", "party");
		System.out.println(value2);
		
		 
		
		 /*
		  
		  String name="Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		String lastname = null;
		
		driver.findElement(By.id("input-email")).sendKeys(name," ",sb," ",sf, lastname);
		
		//charsequence
		//String
		//StringBuffer
		//StringBuilder
		
		  
		  
		  
		  
		  
		  */

	}

}
