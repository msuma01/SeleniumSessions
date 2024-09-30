package webDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsWithLabels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		Thread.sleep(4000);
WebElement label = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
	WebElement label2 = driver.findElement(By.xpath("//label[text()='Password']"));
	driver.findElement(with(By.id("input-email")).below(label)).sendKeys("abc@gmail.com");
	driver.findElement(with(By.id("input-email")).below(label).above(label2)).sendKeys("pqr@gmail.com");
		
		
		//Practice:
	WebElement button = driver.findElement(By.cssSelector("input.btn"));
	WebElement checkbox = driver.findElement(By.cssSelector("input[name='agree']"));
		WebElement Privacypolicy = driver.findElement(By.cssSelector("a.agree"));
//		
		
	//	driver.findElement(with(By.cssSelector("a.agree")).toLeftOf(button).toRightOf(Privacypolicy)).click();
		
		
		//driver.findElement(with(By.cssSelector("input[name='agree']")).toLeftOf(button)).click();
		
		driver.findElement(with(By.cssSelector("a.agree")).toLeftOf(checkbox)).click();
		String beforeText = driver.findElement(By.xpath("//div[@class='pull-right']")).getText();
		System.out.println(beforeText);
		if(beforeText.equals("I have read and agree to the")&& checkbox.isSelected()) {
			System.out.println("The Text:"+" "+beforeText+"Clicked the PrivacyPolicylink and checkbox is checked");
	}

}
}
