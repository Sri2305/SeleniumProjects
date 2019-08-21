package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("Test");
		//driver.findElement(By.id("passwd")).sendKeys("12345");
		
		//findElements
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("elements are" +elements.size());
		for(int i=0;i<elements.size();i++) {
			System.out.println("Elements are"+ elements.get(i).getAttribute("value"));
			
		}
		driver.close();
	}

}
