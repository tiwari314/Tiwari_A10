package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetTitle {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//<title>Online Shopping India Mobile, Cameras, Lifestyle &amp; more Online @ Flipkart.com</title>
	  String title = driver.getTitle();
	  System.out.println(title); 
	  if(title.equals("Online Shopping India Mobile, Cameras, Lifestyle &amp; more Online @ Flipkart.com"))
	  {
		  System.out.println("web page id displayed");
	  }
	}

}
