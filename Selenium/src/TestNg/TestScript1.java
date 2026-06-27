package TestNg;

import org.openqa.selenium.By;
import org.slf4j.helpers.Reporter;
import org.testng.IReporter;
import org.testng.annotations.Test;
import org.testng.reporters.IReporterConfig;

public class TestScript1 extends BaseClass {
	@Test
	public void clickonBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("Bookspage is Displayed",true);
	}

}
