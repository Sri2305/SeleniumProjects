package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/");
		//xpath
		//And and OR
		driver.findElement(By.xpath("//*[@name='uid' and @type= 'text']")).sendKeys("test");
		//text
		String user = driver.findElement(By.xpath("//td[text()='UserID']")).getText();
		String pass = driver.findElement(By.xpath("//td[text()='Password']")).getText();
		System.out.println(user+pass);
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("test");
		//contains for xpath
		driver.findElement(By.xpath("//*[contains(@name,'pass')]")).clear();
		//driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();
		//starts-with
	    String test = 	driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).getText();
	    System.out.println(test);
	    //driver.close();

	}

}
