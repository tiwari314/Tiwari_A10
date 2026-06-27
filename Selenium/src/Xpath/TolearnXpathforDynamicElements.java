package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnXpathforDynamicElements {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).click();
		driver.quit();
	}

}
