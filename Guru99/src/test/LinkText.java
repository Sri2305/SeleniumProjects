package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		//driver.findElement(By.linkText("click here")).click();
		//System.out.println("Title : " +driver.getTitle());
		
		//driver.findElements(By.partialLinkText("here"));
		//List <WebElement> elements = driver.findElements(By.partialLinkText("here"));
	/*	for(int s=0;s<elements.size();s++) {
			elements.get(s).click();
		}*/
		driver.findElement(By.partialLinkText("here")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());

Thread.sleep(5000);
	driver.get("http://demo.guru99.com/test/newtours");
	String t1 = driver.findElement(By.partialLinkText("EGIS")).getText();
	String t2 = driver.findElement(By.partialLinkText("egis")).getText();
	System.out.println(t1 +"\n" +t2);
	driver.close();
	}

}
