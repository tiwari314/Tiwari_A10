package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDraganddrop {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Actions act = new Actions(driver);
		WebElement Source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		act.dragAndDrop(Source, target).perform();

}
}