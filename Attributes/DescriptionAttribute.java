package Attributes;

import org.testng.annotations.Test;

public class DescriptionAttribute {

	/*
	 * Description Attribute - It is a String which is attached to the @Test
	 * annotation that describes the information about the test.
	 */

	@Test(description = "Amazon great indian sale")  //  --------- Print with description
	public void Amazon() {   

	}

	@Test                    //--------- No description
	public void flipkart() {   

	}
}
