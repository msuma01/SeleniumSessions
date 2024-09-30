package mytests;

import org.testng.annotations.Test;

public class DependsonMethodConcept {
	@Test() 
	public void LoginTest() {
		int i=5/0;
		System.out.println("Login Test");
		
	}
	
	@Test (dependsOnMethods="LoginTest")
	public void homePageTest() {
		
		System.out.println("homePage Test");
		
	}
	@Test(dependsOnMethods="homePageTest")
	public void searchTest() {
		
		System.out.println("search Test");
		
	}

}
