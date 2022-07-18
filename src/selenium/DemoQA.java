package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriverManager.ChromeDriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("0", 1000);
	Thread.sleep(5000);	
WebElement gv=driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]"));
gv.click();
	}

}
 