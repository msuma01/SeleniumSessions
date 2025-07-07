package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		selectFutureDate("February 2026",30);
		//april, june ,sept,nov
	}
	public static void selectFutureDate(String expMonthYear, int Day) {
		//leap year:feb:29
		//non leap year: feb: 28
		//for 30 days month
		
		
		
		
		if(expMonthYear.contains("February") && Day>=29) {
			System.out.println("wrong day is passed please pass the right date for february"+Day);
			return;
		}
		
		if(Day>=1 &&Day<=31) {
		String actMonYear= driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(actMonYear);
		
		while(!actMonYear.equalsIgnoreCase(expMonthYear)) {
			//click on the next button
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYear= driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonYear);
			
		}
		//selectDate("18");
		selectDate(Day);
	}
		else {
			System.out.println("Please select the correct date");
		}
	}
	public static void selectDate(int Day) {
		driver.findElement(By.xpath("//a[text()='"+Day+"']")).click();
		
	}

}
