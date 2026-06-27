package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7price {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		driver.findElement(By.xpath("//input[@value='Choose This Flight']")).click();
	}

}
