package webDriverBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightContextClick {

	static WebDriver driver;
	public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	Actions act = new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
//	   List<WebElement> MenuList = driver.findElements(By.cssSelector("ul.context-menu-list span"));
//	 //  List<String> alllist = new ArrayList <String>();
//	   System.out.println(MenuList.size());
//	   for(WebElement e: MenuList) {
//		 String text = e.getText();
//		 System.out.println(text);
//		 if(text.contains("Copy")) {
//			 e.click();
//			 break;
//		 }
	   }
	
	

	}


