package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\723825\\Desktop\\Learning\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		driver.navigate().to("http://demo.guru99.com/test/accessing-nested-table.html");
		String t2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
		System.out.println(t2);
		driver.navigate().to("https://www.moneycontrol.com/stocks/marketstats/index.php");
		String t3=driver.findElement(By.xpath("//*[@id=\"priceshok_bse\"]/div[1]/table/tbody/tr[4]/td[1]/a")).getText();
		System.out.println(t3);
		driver.quit();
	}

}
