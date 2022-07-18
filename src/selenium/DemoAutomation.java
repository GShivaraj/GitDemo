package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		highlight(driver, driver.findElement(By.id("txtUsername")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.name("txtPassword")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.linkText("Forgot your password?")));
		Thread.sleep(2000);
		highlight(driver,driver.findElement(By.xpath("//*[@id=\"divLogo\"]")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.xpath("//span[@style='color:red; font-weight:bold; z-index:100;']")));
		Thread.sleep(2000);

		highlight(driver, driver.findElement(By.className("button")));


	}
	public static void highlight(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:black')", element);
		

	}

}
