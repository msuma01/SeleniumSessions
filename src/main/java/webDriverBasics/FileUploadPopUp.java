package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement Choosefile = driver.findElement(By.name("upfile"));
		Choosefile.sendKeys("C:\\Users\\91913\\OneDrive\\Documents\\Book1.xlsx");

	}

}
