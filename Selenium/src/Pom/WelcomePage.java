package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Declaration
			@FindBy(linkText = "Register")
			private WebElement regLink;
			
			@FindBy(linkText = "Log in")
			private WebElement loglink;
			
			@FindBy(id = "small-searchterms")
			private WebElement searchID;
			
			@FindBy(xpath = "//input[@value='Search']")
			private WebElement searchtext;
			
			//Initialization
			
			public WelcomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}

			// calling getter methods
			public WebElement getRegLink() {
				return regLink;
			}

			public WebElement getLoglink() {
				return loglink;
			}

			public WebElement getSearchID() {
				return searchID;
			}

			public WebElement getSearchtext() {
				return searchtext;
			}


	}

