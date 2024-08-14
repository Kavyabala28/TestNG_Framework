package Attributes;

import org.testng.annotations.Test;

public class InvocationAttribute {

	/*
	 * 1. invocationCount - defines the number of times a test method is performed.
	 * 
	 * 2. invocationTimeOut - The invocationTimeOut attribute sets the maximum
	 * amount of time (in milliseconds) that all invocations of the test method
	 * together should take.
	 * 
	 * 3. ThreadPoolSize - defines the number of threads to be used while running a
	 * test method.
	 */

	@Test(invocationCount = 8, invocationTimeOut = 6000, threadPoolSize = 2)
	public void create() throws InterruptedException {
		System.out.println("Create");
		Thread.sleep(500);
	}

	@Test
	public void edit() {
		System.out.println("Edit");
	}

	@Test
	public void delete() {
		System.out.println("Delete");
	}

}
