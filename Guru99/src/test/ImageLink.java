package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook Home\"]")).click();
		if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
			System.out.println("homepage");
		}
		else {
			System.out.println("no homepage");
		}
		driver.close();
	}
}
