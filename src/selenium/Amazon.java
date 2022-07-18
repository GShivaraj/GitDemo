package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();


		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");



		Thread.sleep(5000);
		WebElement ai= driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[3]"));
		ai.click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("0", 1000);

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[18]")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				String childWindow = window;
				driver.switchTo().window(childWindow);
				String r=driver.getCurrentUrl(); 
				System.out.println("childWindow,"+r);
				Thread.sleep(7000);
			}
		}
		
		driver.switchTo().window(parentWindow); 
		String e=driver.getCurrentUrl();
		System.out.println("parentWindow,"+ e);


		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();
		
		driver.findElement(By.linkText("Mobiles & computer accessories")).click();
		
	
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeAsyncScript("0", 1000);
		driver.findElement(By.xpath("//*[@id=\"slot-15\"]/div/div/div[2]/div[3]/div/div[2]/div/div/a[1]/div/div/img")).click();


	}

}
