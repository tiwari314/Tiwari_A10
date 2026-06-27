package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfgurationAnnotations {
	 @BeforeSuite
	    public void beforeSuite() {
	        Reporter.log("Before Suite is executed", true);
	    }

	    @AfterSuite
	    public void afterSuite() {
	        Reporter.log("After Suite is executed", true);
	    }

	    @BeforeTest
	    public void beforeTest() {
	        Reporter.log("Before Test is executed", true);
	    }

	    @AfterTest
	    public void afterTest() {
	        Reporter.log("After Test is executed", true);
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	        Reporter.log("Before Class is executed", true);
	    }

	    @AfterClass
	    public void afterClass() {
	        Reporter.log("After Class is executed", true);
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        Reporter.log("Before method is executed", true);
	    }

	    @AfterMethod
	    public void afterMethod() {
	        Reporter.log("After Method is executed", true);
	    }

	    @Test
	    public void demo() {
	        Reporter.log("Test method is executed", true);
	    }
	}


