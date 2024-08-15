package Attributes;

import org.testng.annotations.Test;

public class TimeOutAttribute {
	
	/* Timeout attribute - checks if the code runs within specified time limits. */

	@Test(timeOut = 2000)
	public void run() throws InterruptedException {
		System.out.println("Run");
		Thread.sleep(1000);
	}
}
