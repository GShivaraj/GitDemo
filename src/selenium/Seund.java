package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seund {

	public static void main(String[] args) throws InterruptedException {
		
	
		         WebDriver driver = new ChromeDriver();

		       driver.manage().window().maximize();

		       driver.get("https://www.browserstack.com/");
		       JavascriptExecutor js=(JavascriptExecutor) driver;

		      js.executeScript("scroll(0,300)");

		       Actions ac = new Actions(driver);

		WebElement live= driver.findElement(By.xpath("(//div[.=' Interactive cross browser testing '])[1]"));
		
		ac.moveToElement(live).build().perform();

	Thread.sleep(3000);


	WebElement automate= driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']")); automate.click();
	 JavascriptExecutor js1=(JavascriptExecutor) driver;

     js1.executeScript("scroll(0,400)");

	
	driver.findElement(By.xpath("//a[@title='Features']")).click();


	

		Thread.sleep(4000);

		driver.quit();  

		   }

}

