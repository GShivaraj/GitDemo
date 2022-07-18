package selenium;

import java.io.File;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GIT {

	public static void main(String[] args) throws InterruptedException {
		Random random=new Random();


		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://github.com/login");
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);		
		
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));

		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys("venkata"+random.nextInt(200)+"@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		Thread.sleep(3000);
		String t=driver.getCurrentUrl();
		System.out.println(t);
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File selenium=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenShot\\homepage.png");
		FileUtils.copyFile(selenium, trg);
		
		//screenshot of section/portion of the page
		
		WebElement section=driver.findElement(By.id("login_field"));
		File selenium1=section.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".\\screenShot\\panel_wrapper.png");
		FileUtils.copyFile1(selenium1, trg1);
		
	
	
		
	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:blue')", element);
		
	
	}


}


