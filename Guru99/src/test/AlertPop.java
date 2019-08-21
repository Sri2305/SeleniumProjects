package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[contains(@name,'sub')]")).click();
		String test=driver.switchTo().alert().getText();
		System.out.println(test);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.quit();
		
		
		/*driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("I am In :)");*/
	}

}
