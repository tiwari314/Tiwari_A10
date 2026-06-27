package Xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndexValue {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://homeloans.hdfc.bank.in/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("(//a[text()='Login To NetBanking'])[2]']")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		
		for (String Win : windows) {
			driver.switchTo().window(Win);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.hdfc.bank.in/"));
		}
		}
	}

