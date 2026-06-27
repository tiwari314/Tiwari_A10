package demo;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Tolearnshopperstack {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(30000);
		
		driver.findElement(By.id("compare")).click();
		
		//driver.close();
		driver.quit();
	}
}
