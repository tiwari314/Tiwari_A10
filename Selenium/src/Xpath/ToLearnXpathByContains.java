package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//input[contains@title,'Search')])[1]")).sendKeys("watch");
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(20000);
	    String anu = driver.findElement(By.xpath("//div[Cantains(text(),'Copyright')]")).getText();
	    System.out.println(anu);
		driver.quit();
	}

}
