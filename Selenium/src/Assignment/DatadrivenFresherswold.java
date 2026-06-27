package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenFresherswold {
	public static void main(String[] args) throws IOException {
		FileInputStream anu = new FileInputStream("./Testdata/FreshersWold.Properties");
		Properties prop = new Properties();
		prop.load(anu);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		String Name = prop.getProperty("Name");
		System.out.println(Name);
		String Email = prop.getProperty("Email");
		System.out.println(Email);
		String Mobailno = prop.getProperty("Mobailno");
		System.out.println(Mobailno);
		String Age = prop.getProperty("Age");
		System.out.println(Age);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.linkText("REGISTER NOW")).click();
		
		
		
	}

}
