package mytests;

import org.testng.annotations.Test;

public class InvocationCountConcepts {
	@Test  (invocationCount = 10 , priority=2)
	public void paymentmethod() {
		System.out.println("Payment Method");
	}
		@Test  (invocationCount = 10 , priority =1)
		public void cartmethod() {
			System.out.println("cart Method");
	}
}
