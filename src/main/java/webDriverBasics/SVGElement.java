package webDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {
static	WebDriver driver;

	public static void main(String[] args) throws Throwable {
		//SVG-- Scalar Vector Graphs
		// browser ---> page -- iframe --> svg --> g --> path
		
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("q")).sendKeys("macbookpro");
//		driver.findElement(By.xpath("//form[contains(@class,'_2rslOn header-form-search')]//*[local-name()='svg' and @ fill='none']")).click();                                                      
//		//*[local-name()='svg' and @ fill='none']
//		
//		driver= new ChromeDriver();
//		driver.get("https://petdiseasealerts.org/forecast-map#/");
//		Thread.sleep(2000);
//		WebElement frameid = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
//		driver.switchTo().frame(frameid);
//		
//		String SVGPath = "//*[local-name()='svg'and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";
//		List<WebElement> path = driver.findElements(By.xpath(SVGPath));
//		 System.out.println(path.size());
//		 Actions act = new Actions(driver);
//		for(WebElement e: path) {
//			act.moveToElement(e).perform();
//
//			String nameAttr = e.getAttribute("name");
//			System.out.println(nameAttr);
//		
//		}
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";

		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);
		for (WebElement e : statesList) {
			
			act.moveToElement(e).perform();

			String nameAttr = e.getAttribute("name");
			System.out.println(nameAttr);
			Thread.sleep(1000);
			if(nameAttr.contains("Colorado")) {
				act.click(e).perform();
				break;	
			}
	}

}
}
//SVG: special xpath
		//parent svg: local-name()
		//child: g,path : name()
