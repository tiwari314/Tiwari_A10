package WindowMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolaunchRedbusApplication {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//https://www.flipkart.com/
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();

		System.out.println(url);
		
		if(url.equals("https://www.flipkart.com/")) {
			System.out.println("Welcomepage is displayed");
		}else {
			System.out.println("Welcomepage is not displayed");
			
		}/*
		String Code = driver.getPageSource();
		System.out.println(Code);
		*/
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		driver.quit();
		}
	
}
