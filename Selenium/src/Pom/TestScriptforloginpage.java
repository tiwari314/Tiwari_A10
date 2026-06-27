package Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptforloginpage {
	public static void main(String[] args) throws IOException {
		//store the location of the file
			FileInputStream yn= new FileInputStream("./Testdata/commonData.properties");
			
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
			lp.getPwdid().sendKeys(Email);
			lp.getPwdid().sendKeys(Password);
			lp.getLoginButton().click();
			
		
	}
	
	}


