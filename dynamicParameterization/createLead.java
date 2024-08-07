package dynamicParameterization;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class createLead extends commonExecution {

	@Test(dataProvider = "createLeadExcel")
	public void runCreateLead(String cname, String fname, String lname) {

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(indices = { 1 })
	public String[][] createLeadExcel() throws IOException {
		return readExcelData.readExcel("CreateLeadData");
	}

}
