package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Assignment2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Anuruddh");
		driver.findElement(By.id("LastName")).sendKeys("tiwari");
		driver.findElement(By.id("Email")).sendKeys("hgyuhoikhyuj");
		driver.findElement(By.id("Password")).sendKeys("shdgdg");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shsh");
		driver.findElement(By.name("register-button")).click();
		driver.quit();
		
	}

}
