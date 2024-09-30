package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import webDriverBasics.SuggestionsException;

public class Utility_Elements_Practice {
	private WebDriver driver;
	/*
	 * This is a constructor used to initialize the driver
	 */
	public Utility_Elements_Practice(WebDriver driver) {
		this.driver = driver;
	}
	
	/*This method is used to get element
	 * @return By locator
	 */
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/*@return is void
	 * This method is used to perform sendkeys( String)
	 */
	public  void dosendkeys(By locator , String value) {
		getElement(locator).sendKeys(value);
	}
	
	/*@return is void
	 * This method is used to perform Click operation
	 */
	public  void doClick(By locator) {
		getElement(locator).click();	
	}
	
	/*
	 * This method is used to input the text into the textbox no return
	 * 
	 * @parameters value and locator
	 */
	public void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	/*
	 * This method is used to input the text in the form of character sequencei.e,
	 * Address no return
	 * 
	 * @parameters-> locator and character sequence
	 */

	public void doSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}

	
	

	/*
	 * This method is used to get text from the specific locator returns null or
	 * element Text
	 * 
	 * @param==> locator
	 */
	public String getElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		} else {
			System.out.println("Element Text is null : " + eleText);
			return null;
		}

	}

	public void ElementDisabled() {

	}

	/*
	 * This method is used to present if any element is displayed returns "True" or
	 * False"
	 * 
	 * @param==>locator
	 */

	public boolean IsElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed :" + locator);
			return false;
		}
	}

	/*
	 * This method is used to verify if element is enable returns boolean (True or
	 * False)
	 * 
	 * @param===> locator
	 */

	public boolean IsElementEnabled(By locator) {
		return getElement(locator).isEnabled();

	}

	/*
	 * This method is used to Select(Checkbox) no return
	 * 
	 * @param==> locator
	 */

	public void ElementSelectDeselect(By locator) {
		getElement(locator).click();
	}

	/*
	 * This method is used to print the Element list on the page no return type
	 * 
	 * @param==> locator
	 */
	public void printElementList(By locator) {
		List<String> list = getElementsTextList(locator);
		for (String e : list) {
			System.out.println(e);
		}

	}

	/*
	 * This method is used to create list of WebElements returns List of WebElements
	 * 
	 * @param==> locator having multiple elements
	 */

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	/*
	 * This method is used to get the ElementsCount returns locators count
	 * 
	 * @param===> locator
	 */

	public int getElementsCount(By locator) {
		return getElements(locator).size();

	}

	/*
	 * This method is used to get ElementsTExtList retun textlist of all elements
	 * 
	 * @param===>locator
	 */

	public List<String> getElementsTextList(By locator) {
		List<WebElement> EleList = getElements(locator);
		List<String> EleTextList = new ArrayList<String>();
		for (WebElement e : EleList) {
			String AllText = e.getText();
			if (AllText.length() != 0) {
				EleTextList.add(AllText);
			}
		}
		return EleTextList;
	}

	/*
	 * This method is used to Search for the given sendkeys based on the expected
	 * matchvalue (#Google Search field and Suggestions) returns boolean (True or
	 * False)
	 * 
	 * @param==> searchField, suggestions, searchkey and ,matching value
	 */

	public boolean doSearch(By searchField, By suggestions, String searchkey, String matchvalue)
			throws InterruptedException {
		boolean flag = false;

		//doSendKeys(searchField, searchkey);
		doSendKeys(searchField, searchkey);
		Thread.sleep(5000);
		List<WebElement> sugglist = getElements(suggestions);
		int totalSuggestions = sugglist.size();
		System.out.println("Total number of Suggestion===" + sugglist.size());

		if (totalSuggestions == 0) {
			System.out.println("No suggestions found......");
			throw new SuggestionsException("******** NO SUGGESTIONS FOUND************");
		}

		for (WebElement e : sugglist) {
			String allsuggestions = e.getText();
			System.out.println(allsuggestions);
			if (allsuggestions.contains(matchvalue)) {
				e.click();
				flag = true;
				break;
			}

		}
		if (flag) {
			System.out.println(matchvalue + ":is found ");
			return true;
		} else {
			System.out.println(matchvalue + ": is not found in the suggestions");
			return false;
		}
	}

	/*
	 * This method is used to verify the element isnot displayed on the page returns
	 * boolean (True or False)
	 * 
	 * @param===> locator
	 */

	public boolean IsElementNotPresent(By locator) {
		if (getElementsCount(locator) == 0) {
			return true;
		}
		return false;
	}
	/*
	 * This method is used to verify multiple elements present on the webpage
	 * returns boolean (True or False)
	 * 
	 * @param===> locator
	 */

	public boolean IsElementPresentMultipleTimes(By locator) {
		if (getElementsCount(locator) >= 0) {
			return true;
		}
		return false;
	}

	/*
	 * This method is used for validating particular Element ( multiple Elements
	 * count) must or must not be present on the page returns boolean (True or
	 * False)
	 * 
	 * @param->locator and expectedElement Count
	 */
	public boolean IsElementPresent(By locator, int expectedElementCount) {
		if (getElementsCount(locator) == expectedElementCount) {

			return true;
		} else {

			return false;
		}
	}
	/*
	 * This method is used for validating particular Element must or must not be
	 * present on the page returns boolean (True or False)
	 * 
	 * @param->locator
	 */

	public boolean IsElementPresent(By locator) {
		if (getElementsCount(locator) == 1) {
			System.out.println("Logo is present on the page");
			return true;
		} else {
			System.out.println("Logo is not present on the page");
			return false;
		}

	}
	/*
	 * This method is used to select the dropdown value by using the VisibleText in
	 * the dropdown no return value
	 * 
	 * @param====> locator, visibleText
	 */

	public void selectDropdownByVisibleText(By locator, String visibletext) {
		WebElement sele = getElement(locator);
		Select se = new Select(sele);
		se.selectByVisibleText(visibletext);
	}

	/*
	 * This method is used to select the dropdown value by using the index in the
	 * dropdown no return value
	 * 
	 * @param====> locator, index
	 */

	public void selectDropdownByIndex(By locator, int index) {
		WebElement sele = getElement(locator);
		Select se = new Select(sele);
		se.selectByIndex(index);
	}

	/*
	 * This method is used to select the dropdown value by using the 'Value'
	 * attribute in the DOM no return value
	 * 
	 * @param====> locator, 'Value' attribute in the DOM
	 */

	public void selectDropdownByValue(By locator, String Value) {
		WebElement sele = getElement(locator);
		Select se = new Select(sele);
		se.selectByValue(Value);
	}
	
	/*
	 * DONOT Use THis way it will be more complex and in the case of user point of view why should he need to enter
	 * all the different if he chooses only select by value
	 */
//	public void SelectDropDown(By locator, String selecttype, String text, int index, String Value) {
//		
//		Select sel = new Select(getElement(locator));
//		switch (selecttype.toLowerCase()) {
//		case "visible text":
//			sel.selectByVisibleText(text);
//			break;
//		case "index":
//			sel.selectByIndex(index);
//			break;
//		case "value":
//			sel.selectByValue(Value);
//			break;
//
//		default:
//			break;
//		}
//	}
	
	/*this method is used to count the number of elements in the dropdown of select tag
	 * return type is 'int'
	 * @param===> locator
	 */
	
	public  int getDropdownOptionsCount(By locator) {
		WebElement sele = getElement(locator);
		Select se = new Select(sele);
		List<WebElement> alloptionsdropdown = se.getOptions();
		int len = alloptionsdropdown.size();
		return len;
	}
}
