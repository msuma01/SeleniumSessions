package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLabelsRegisterPage {
	static WebDriver driver;
	public static void main(String[] args) {
		//Actions: Default class
		//user actions: Mouse and keyboard
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String label1=driver.findElement(By.xpath("//label[@for='input-firstname']")).getText();
		System.out.println(label1);
		
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String label2=driver.findElement(By.xpath("//label[@for='input-lastname']")).getText();
		System.out.println(label2);
		
		String label3=driver.findElement(By.xpath("//label[@for='input-email']")).getText();
		System.out.println(label3);
		
		String label4=driver.findElement(By.xpath("//label[@for='input-telephone']")).getText();
		System.out.println(label4);
		
		String label5=driver.findElement(By.xpath("//label[@for='input-password']")).getText();
		System.out.println(label5);
		
		String label6=driver.findElement(By.xpath("//label[@for='input-confirm']")).getText();
		System.out.println(label6);
	}

}
