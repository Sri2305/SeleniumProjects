package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/login.html");
	    WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.name("passwd"));
		email.sendKeys("abc@com");
		pwd.sendKeys("12345");
		email.clear();
		pwd.clear();
		email.sendKeys("xyz.com");
		pwd.sendKeys("9876");
		driver.findElement(By.id("SubmitLogin")).click();
	    driver.close();
		
	}

}
