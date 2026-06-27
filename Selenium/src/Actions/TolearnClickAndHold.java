package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnClickAndHold {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		driver.findElement(By.xpath("//*[.=role='button'][2]"));
		
		driver.findElement(By.id("password")).sendKeys("test@12345");
		WebElement eyeIcon = driver.findElement(By.xpath("//img[contains(@src,'assets/img/Revamp/icon_eye_close.svg']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).perform();
		
		
		
		

}
}