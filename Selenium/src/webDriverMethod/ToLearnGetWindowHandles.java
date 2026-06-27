package webDriverMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.flipkart.com/");
    Thread.sleep(5000);

    // Example click that opens new window/tab
    // Change locator based on actual element
    driver.findElement(By.linkText("Login")).click();

    // Get all window handles
    Set<String> allWinIds = driver.getWindowHandles();

    // Print all window IDs
    for (String winId : allWinIds) {
        System.out.println(winId);
    }

    driver.quit();

}