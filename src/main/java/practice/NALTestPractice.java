package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NALTestPractice {

	public static void main(String[] args) {
		
		Utilitybrowserpractice bu = new Utilitybrowserpractice();
		WebDriver driver = bu.launchbrowser("Edge");
		//Enter Url
		bu.Enterurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title=bu.getPageTitle();
		System.out.println(title);
		
		if(title.equals("Account Login")) {
			System.out.println("Browser is landed to the correct page with title :"+" "+title);
		}else {
			System.out.println("Browser is landed to the incorrect page");
		}
		
		
		//Click on Register link
		Utility_Elements_Practice ue = new Utility_Elements_Practice(driver);
		By register = By.linkText("Register");
		ue.doClick(register);
		
		//Getting the Header Text
		By header1 = By.tagName("h1");
		String hd=ue.getElementText(header1);
		System.out.println("The Landed Page Header name is: "+hd);
		
		//Enter the details of Registration page
		By Firstname = By.id("input-firstname");
		ue.dosendkeys(Firstname, "Suma");
		
		//Last name
		By Lastname = By.id("input-lastname");
		ue.dosendkeys(Lastname, "Srivalli");
		
		//Email
		By Email = By.id("input-email");
		ue.dosendkeys(Email, "morapakalasuma1@gmail.com");
		
		//Phone
		By phone = By.id("input-telephone");
		ue.dosendkeys(phone, "023783745798");
		
		//Password
		By password = By.id("input-password");
		ue.dosendkeys(password, "pwd123");
		
		//Confirm Password
		By pwdconfirm = By.id("input-confirm");
		ue.dosendkeys(pwdconfirm, "pwd123");
		
		//Radio button
		By radiobtn = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		ue.doClick(radiobtn);
		
		//Checking checkbox
		By checkbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		ue.doClick(checkbox);
		
		//Click on continue
		By contButton = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
		ue.doClick(contButton);
		
		//getpagetitle
		System.out.println(bu.getPageTitle());
		
		//Account Page header
		By Accountcreated = By.xpath("//*[@id=\"content\"]/h1");
		String h2= ue.getElementText(Accountcreated);
		//Validation
		if(h2.equals("Your Account Has Been Created!")) {
			System.out.println("Account is created successfully with header : "+h2);
		}else
			System.out.println("Account is not created");
		
//		//Continue btn
//		By continuebutton = By.xpath("//*[@id=\"content\"]/div/div/a");
//		ue.doClick(continuebutton);
		//Logout link
		By Logoutlink = By.xpath("//*[@id=\"column-right\"]/div/a[13]");
		ue.doClick(Logoutlink);
		
		By Loginlink = By.xpath("//*[@id=\"column-right\"]/div/a[1]");
		ue.doClick(Loginlink);
		
		By Email2 = By.id("input-email");
		ue.dosendkeys(Email2, "morapakalasuma1@gmail.com");
		
		By password2 = By.id("input-password");
		ue.dosendkeys(password2, "pwd123");
		
		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		ue.doClick(login);
		
		
		String title2 = bu.getPageTitle();
		System.out.println(title2);
		if(title2.equals("My Account")) {
			System.out.println("Logged in successfully");
		}else
		{
			System.out.println("Log in is not done");
		}
		
		
		bu.closebrowser();
	
		
		
		
		

	}

}
