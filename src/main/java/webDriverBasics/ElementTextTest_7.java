package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest_7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ElementUtil_6 eu = new ElementUtil_6(driver);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By header1 = By.tagName("h2");
		String t1= eu.getElementText(header1);
		System.out.println(t1);
		
		By header2 = By.tagName("p");
	 String te=eu.getElementText(header2);
	 System.out.println(te);
	 
	    By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
	   String text= eu.getElementText(para);
	   System.out.println(text);
	   
	   By fp = By.xpath("//*[@id=\"column-right\"]/div/a[3]");
	   String forgot =eu.getElementText(fp);
	   System.out.println(forgot);
	   
	   By footerheader = By.tagName("h5");
	   String fh = eu.getElementText(footerheader);
	   System.out.println(fh);
	}

}
