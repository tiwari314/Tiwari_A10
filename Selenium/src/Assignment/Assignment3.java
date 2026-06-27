package Assignment;

import javax.swing.text.Position;

import org.checkerframework.checker.index.qual.LessThanUnknown;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hddjd");
		driver.findElement(By.id("Password")).sendKeys("jddh");
		driver.findElement(By.id("RememberMe")).click();
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.className("button-1 login-button")).click();
		driver.close();
		
		/*Dimension size = driver.manage().window().getSize();
		System.out.println(size.height);
		System.out.println(size.width);
		 Point Les = driver.manage().window().getPosition();
		 
		System.out.println(Les.getX());
		System.out.println(Les.getY());
		driver.manage().window().setPosition(new Point(10,20));
		driver.quit();*/
	}

}
