package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class to {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.hdfc.bank.in/");
		driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
		driver.findElement(By.xpath("(//span[text()= 'NetBanking']) [1]")).click();
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Abc1234");*/
	
}
}