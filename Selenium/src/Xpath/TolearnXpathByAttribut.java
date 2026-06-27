package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnXpathByAttribut {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("sdas32@gmail.com");
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
		driver.quit();
	}

}
