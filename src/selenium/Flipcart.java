package selenium;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_2doB4z")).click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("fridge"+Keys.ENTER);

		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("0", 100);
		driver.findElement(By.xpath("//*[@id='pincodeInputId']")).sendKeys("523001"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String parentWindow =driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window: allWindows)
		{
			if(!window.equals(parentWindow))
			{
				String childWindow = window;
				driver.switchTo().window(childWindow);
			String r =driver.getCurrentUrl();
			System.out.println("childWindow,"+r);
			}
			
		}

		driver.switchTo().window(parentWindow);
		String e = driver.getCurrentUrl();
		System.out.println("parentWindow,"+e);
		Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\ADMIN\\Desktop.png"));

}

	}


