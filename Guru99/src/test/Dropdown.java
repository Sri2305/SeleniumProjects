package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select drpdown = new Select(driver.findElement(By.name("country")));
		drpdown.selectByValue("INDIA");
		//multiple selection
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select (driver.findElement(By.id("fruits")));
		fruits.selectByIndex(3);
		fruits.selectByVisibleText("Banana");
		fruits.selectByValue("apple");
		fruits.deselectAll();
		driver.close();
				
	}

}
