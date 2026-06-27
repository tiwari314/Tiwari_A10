package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String property = driver.findElement(By.xpath("//div[@role='button']")).getCssValue("color");
		System.out.println(property);
		driver.quit();*/
		
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.xpath("//input[@value='Search store']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}

}
