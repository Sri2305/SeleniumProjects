package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioandcheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio1.click();
		radio2.click();
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		System.out.println(check1.isSelected());
		check1.click();
		check2.click();
		for (int i=0;i<2;i++) {
			System.out.println(check1.isSelected());
		}
		driver.close();		

	}

}
