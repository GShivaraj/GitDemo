package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQA {
	static WebDriver driver;
	@Test
public	void BasicUrl() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
	}
	@Test(priority=1)
 public void StudentRegistrationForm() {
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Shiva");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Gonepalli");
	
}
}
