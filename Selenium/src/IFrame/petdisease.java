package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class petdisease {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Go to maps']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("argument[0].scrolltoview(true)", ele);
		ele.click();
		
		

}
}