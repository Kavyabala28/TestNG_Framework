package Attributes;

import org.testng.annotations.Test;

public class AlwaysRunAttribute {

	/*
	 * alwaysRun attribute - Default values is 'False'. If set to true, this test
	 * method will always be run even if it depends on a method that failed.
	 */
	
	@Test
	public void iphone() {
		System.out.println("Iphone");
	}

	@Test(timeOut = 2000)
	public void samsung() throws InterruptedException {
		System.out.println("SAMSUNG");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods = { "iphone", "samsung" }, alwaysRun = true)
	public void vivo() {
		System.out.println("VIVO");
	}
}
