package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 16 pro");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("//span[contains(text(),'iPhone 16 Plus')]"));
		//List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'iPhone 16 Plus')]/../../../..//span[contains(text(),='₹')]"));
		
		for(WebElement id:names) 
		{
			System.out.println(id.getText());
			}
		List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'iPhone 16 Plus')]/../../../..//span[contains(text(),'₹')]"));
		
		for(WebElement cost:price) {
			System.out.println(cost.getText());
		}
		driver.quit();
	}

}
