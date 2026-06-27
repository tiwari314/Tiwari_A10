package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDataFromePropertiesFile {
	public static void main(String[] args) throws IOException {
		
		//store the location of the file
		FileInputStream yn= new FileInputStream("./Testdata/commenData.properties");
		
		//file specific object
		Properties prop= new Properties();
		
		//load
		prop.load(yn);
		
		//get property
		String url = prop.getProperty("url");
		System.out.println(url);
		String Email = prop.getProperty("Email");
		System.out.println(Email);
		String Password = prop.getProperty("Password");
		System.out.println(Password);
		
		//TestScript
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);
   
	
	
	
		

}
}