package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		//verifying the search fields in MakeMytrip
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Utility_Elements_Practice up = new Utility_Elements_Practice(driver);
		Thread.sleep(2000);
		By closewindow = By.xpath("//div[@class='imageSlideContainer']//span[@class='commonModal__close']");
		up.doClick(closewindow);
		//From 
		By searchfield = By.xpath("//div[@class='fsw_inner returnPersuasion']//label/input[@id='fromCity']");
		By suggestionsList = By.xpath("//div[@class='react-autosuggest__section-title']/following-sibling:: ul/li");
		up.doSearch(searchfield, suggestionsList,"Hyderabad","Hyderabad");
		//To
		By searchfield2 = By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']/label//input[@id='toCity']");
		By suggestionsList2 = By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween']//div[@class='react-autosuggest__section-title']//following-sibling::ul/li");
		Thread.sleep(2000);
		up.doSearch(searchfield2, suggestionsList2, "Bengaluru", "Mangalore");
		
		

	}

}
