package Attributes;

import org.testng.annotations.Test;

public class Priority {

	/*
	 * Priority - default value is 0
	 * 
	 * If we don't mention any priority attribute, then it will execute the method
	 * based on ASCII value
	 */

	@Test(priority = -6)           
	public void myntra() {
		System.out.println("Myntra.com");     // ------------ execute 1st because we mention priority in '-' which is < 0
	}

	@Test(priority = 1)
	public void amazon() {
		System.out.println("Amazon.com");    // ------------- execute finally, priority is '1'
	}

	@Test
	public void flipkart() {
		System.out.println("Flipkart.com");   //------------ execute 2nd because priority is '0'
	}

}
