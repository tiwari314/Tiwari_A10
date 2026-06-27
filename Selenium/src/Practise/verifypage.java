package Practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifypage {
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String anu = driver.getCurrentUrl();
		
		
		if (anu.equals("https://www.flipkart.com/")) {
			System.out.println("Home page is displayed");
			
		} else {
			System.out.println("Home page is not  displayed");
			

		}
	
		driver.findElement(By.id("compare")).click();
		String nu = driver.getPageSource(); 
		System.out.println(nu);
		
		Set<String> allWinids = driver.getWindowHandles();
		for(String id: allWinids) {
		
			System.out.println(id);
		driver.close();
	}}}
