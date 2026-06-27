package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnScrolling {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/");
		
		Actions act = new Actions(driver);
		//act.scrollByAmount(0, 2000).perform();
		
		 WebElement button = driver.findElement(By.xpath("//button[.='More News']"));
		 act.scrollToElement(button).perform();
		 button.click();
		 

}
}