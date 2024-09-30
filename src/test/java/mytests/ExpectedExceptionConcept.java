package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	int age;
	
	@Test (expectedExceptions= {ArithmeticException.class, NullPointerException.class})
	public void PaymentTest() {
		int z=3/2;
		System.out.println(z);
		
		ExpectedExceptionConcept obj = null;
		obj.age = 20;
		
	}

}
