package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
	    Actions Builder = new Actions(driver);
	    WebElement email = driver.findElement(By.id("email"));
	    WebElement password = driver.findElement(By.id("pass"));
	  Action test =  Builder.moveToElement(email).click()
			  .keyDown(email,Keys.SHIFT)
			  .sendKeys(email,"Test")
			  .moveToElement(password).click()
			  .keyDown(password,Keys.SHIFT)
			  .sendKeys(password,"test")
			  //.contextClick()
			  .build();
	 
	  test.perform();
	}

}
