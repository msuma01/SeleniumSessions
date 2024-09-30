package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	
	/*
BS---ConnectWithDB
BT---Create User
BC---Open Browser

			BM--Login
			Cart Test
			AM---Log out

			BM--Login
			Payment Method
			AM---Log out

			BM--Login
			searching test
			AM---Log out

AC----Close Browser
AT----Delete User
AS----DisconnectWithDB
	 */
	//1
	@BeforeSuite
	public void ConnectWithDB() {
		System.out.println("BS---ConnectWithDB");
		
	}
	
	//it is not mandatory for before suit should be there
	
	//2
	@BeforeTest
	public void CreateUSer() {
		System.out.println("BT---Create User");
	}
	
	//3
	@BeforeClass
	public void OpenBrowser() {
		System.out.println("BC---Open Browser");
	}
	
	//4  //7//10
	@BeforeMethod
	public void LoginToApp() {
		System.out.println("BM--Login");
	}
	
	//11
	@Test
	public void searchTest() {
	System.out.println("searching test");	
	}
	
	//5
	@Test
	public void  cartTest() {
		System.out.println("Cart Test");
	}
	
	//8
	@Test
	public void paymentmethod() {
		System.out.println("Payment Method");
	}
	
	//6 //9//12
	@AfterMethod
	public void Logout() {
		System.out.println("AM---Log out");
	}
	
	//13
	@AfterClass
	public void CloseBrowser() {
		System.out.println("AC----Close Browser");
	}
	
	//14
	@AfterTest
	public void DeleteUser() {
		System.out.println("AT----Delete User");
	}
	
	//15
	@AfterSuite
	public void DisconnectWithdB() {
		System.out.println("AS----DisconnectWithDB");
		
	}

}
