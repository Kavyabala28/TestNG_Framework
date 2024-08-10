package Attributes;

import org.testng.annotations.Test;

public class EnableAttribute {
	
	/*
	 * Enabled attribute - Contains boolean value, default value is true.
	 * 
	 * if you want to skip some test method, then you need to explicitly specify
	 * 'false' value.
	 */
	
	@Test
	public void python() {
		System.out.println("PYTHON language");
	}
	
	@Test(enabled = false)
	public void jira() {
		System.out.println("JIRA is a testing tool");
	}

    @Test
	public void c_language() {
		System.out.println("C language");
	}
}
