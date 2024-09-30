package webDriverBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DragAndDropConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		//drag and drop
		//element to element
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		By SourceElement = By.id("draggable");
		By TargetElement = By.id("droppable");
		
		Actions act = new Actions(driver);
		//a1.a2.a3--> build.perform ---> build will arrange in the same sequence
//		Action dragandDrop = act.clickAndHold(driver.findElement(SourceElement))
//		      .moveToElement(driver.findElement(TargetElement))
//		         .release().build();
//		dragandDrop.perform();
		Thread.sleep(2000);
		
		
		//.build() --> No
				//.perform() --> yes
				//.build().perform() --> yes
				//.build() --> return Action --> can be reused
				
				//Actions -- class -- is used to achieve the builder pattern using method chaining to perform various actions in a sequence
				//Action -- Interface -- build() will return Action (single or composite action) --which can be used later to peform
		
		act.dragAndDrop(driver.findElement(SourceElement), driver.findElement(TargetElement)).perform();

		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File fi= new File("F:\\");
//		Files.copy(src, fi);
	}

}
