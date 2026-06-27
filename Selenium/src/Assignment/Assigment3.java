package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		
			for (String win : windows) {
				driver.switchTo().window(win);
				String url = driver.getCurrentUrl();
				if(url.equals("https://www.facebook.com/nopCommerce")) {
					
					driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("asss@gmail.com");
					driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("dhdh123");
					driver.quit();
				}
		}
		}
		}
