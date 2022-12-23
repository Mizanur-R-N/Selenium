package TestFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookFristScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String BaseUrl = "https://facebook.com";
		
		String username = "abcd";
		String password = "";
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(BaseUrl);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@aria-label='Account']//i[@class='hu5pjgll lzf7d6o1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
