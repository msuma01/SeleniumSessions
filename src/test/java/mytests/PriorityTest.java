package mytests;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test (priority=Integer.MIN_VALUE)
	public void searchTest() {
	System.out.println("searching test");	
	}
	
	//5
	@Test  (priority=Integer.MAX_VALUE)
	public void  cartTest() {
		System.out.println("Cart Test");
	}
	
	//8
	@Test  (priority=2)
	public void aTest() {
		System.out.println("aTest Method");
	}
	@Test  (priority=0)
	public void bTest() {
		System.out.println("bTest Method");
	}
	@Test  (priority=5)
	public void paymentmethod() {
		System.out.println("Payment Method");
	}
	@Test  (priority=4)
	public void cTest() {
		System.out.println("cTest Method");
	}
	
	//Is it a good practice to define the priorities?
		//NOT A GOOD PRACTICE
		//AAA pattern: Arrange Act Assert
		
		
		//CRUD
		//CreateUserTest --T1
			//---fill the form and submit user id--> validate: POST
		
		//RetrieveUserTest -- T2
			//fill the form and submit and get userid (123): POST
			//get the user/userid(123) and validate: GET
		
		//UpdateUserTest -- T3
			//fill the form and submit and get userid (234): POST
			//get the user/userid(234): GET
			//update the user/userid(234): PUT
		

		//DeleteUserTest -- T4 : QA(234) --> stg(900)
			//fill the form and submit and get userid (234)
				//get the user/userid(234)
				//delete the user/userid(234)
}
