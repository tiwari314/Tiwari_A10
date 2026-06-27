package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static void main(String[] args) throws IOException {
		//store the location of the file
			FileInputStream yn= new FileInputStream("./TestData/commondata.properties");
			
			//file specific object
			Properties prop= new Properties();
			
			//load
			prop.load(yn);
			
			//get property
			String url = prop.getProperty("url");
			String Email = prop.getProperty("Email");
			String Password = prop.getProperty("Password");
			
			//Test script
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(url);
			
			WelcomePage wp=new WelcomePage(driver);
			wp.getLoglink().click();
			
			LoginPage lp= new LoginPage(driver);
			lp.getEmailID().sendKeys(Email);
			lp.getPwdid().sendKeys(Password);
			lp.getLoginButton().click();
			
		
	}
	}

	
	