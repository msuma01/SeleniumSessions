package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("div#formTemplateContainer iframe")));
		
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Dhoni");
		driver.findElement(By.cssSelector("input#RESULT_TextField-4")).sendKeys("01/09/1996");
		driver.findElement(By.cssSelector("textarea#RESULT_TextArea-5")).sendKeys("This is a test message");
		driver.findElement(By.name("RESULT_FileUpload-6")).sendKeys("C:\\Users\\91913\\OneDrive\\Documents\\Book1.xlsx");
		driver.findElement(By.cssSelector("input#RESULT_TextField-8")).sendKeys("Suma");
		driver.findElement(By.cssSelector("input#RESULT_TextField-9")).sendKeys("Morapakala");
		driver.findElement(By.cssSelector("input#RESULT_TextField-10")).sendKeys("Yousufguda,Krishna Nagar");
		driver.findElement(By.cssSelector("input#RESULT_TextField-12")).sendKeys(" Hyderabad");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("RESULT_RadioButton-13"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Ohio");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#RESULT_TextField-14")).sendKeys("50045");
		driver.findElement(By.cssSelector("input#RESULT_TextField-15")).sendKeys("5678567856788");
		driver.findElement(By.cssSelector("input#RESULT_TextField-16")).sendKeys("pqr@gmail.com");
		
		//need to comeout of iframe, or come to main page:
		driver.switchTo().defaultContent();
		
		//This Element is on the page which is accessible now
		String header=driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
	

	}

}
