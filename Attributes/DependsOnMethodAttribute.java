package Attributes;

import org.testng.annotations.Test;

public class DependsOnMethodAttribute {

	/*
	 * dependsOnMethod attribute - specify the name of the parent test method on
	 * which the test should be dependent.
	 */
	
	@Test
	public void dog() {
		System.out.println("Dog");
    }

	@Test(timeOut = 2000)
	public void cat() throws InterruptedException { // if cat method fails, food method get skipped
		System.out.println("Cat");
	}

	@Test(dependsOnMethods = { "cat", "dog" })
	public void food() {
		System.out.println("Food");
	}
}
