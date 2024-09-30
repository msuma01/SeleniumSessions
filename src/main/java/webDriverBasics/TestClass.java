package webDriverBasics;

public class TestClass {

	public static void main(String[] args) {
		BrowserUtil ut = new BrowserUtil();
		ut.initDriver("Edge");
		ut.launchurl("https://www.amazon.com");
		String title = ut.getPageTitle();
		System.out.println(title);
		if(title.equals("Amazon.com")){
			System.out.println("Correct title");
		}
		else {
			System.out.println("Wrong Title");
		}
		
		ut.getcurrenturl();
		ut.closebrowser();
	}

}
