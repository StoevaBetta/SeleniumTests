package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {
	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser() {

		
				System.setProperty("webdriver.gecko.driver", "/Users/gerganastoeva/Downloads/Selenium/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

				
				driver.get("https://www.accenture.com");
		
	}
	
	public void searchByKeyWord() {
	try {
		driver.findElement(By.id("homeSearchBar")).sendKeys("Java");
		Thread.sleep(3000);
		driver.findElement(By.id("homeSearchBarIcon")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Cloud Masters Program")).click();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(1000, 0)");
		driver.findElement(By.xpath("/html/body/div[3]/section/div[3]/div/div/main/div[1]/div[1]/div/div[1]/div/div[2]/div/div[1]/a/i")).click();
	
	
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		driver.quit();
	
	}
	

	public static void main(String[] args) {
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		myObj.searchByKeyWord();
		

	}
	

}

