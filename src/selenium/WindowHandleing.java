package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import snippet.Set;

public class WindowHandleing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//Single window
				String parentWindowHandle = driver.getWindowHandle();
				System.out.println("Parent window handle - "+parentWindowHandle + driver.getTitle());
				driver.findElement(By.id("newWindowBtn")).click();
				Set<String> windowHandles = driver.getWindowHandles();
				for (String windowHandle : windowHandles) {
					if(!windowHandle.equals(parentWindowHandle)) {
						driver.switchTo().window(windowHandle);
						driver.manage().window().maximize();
						driver.findElement(By.id("firstName")).sendKeys("Shiva");
					Thread.sleep(3000);
						driver.close();
					Thread.sleep(2000);
				}
			}
			
				driver.switchTo().window(parentWindowHandle);
				driver.findElement(By.id("name")).sendKeys("Gonepalli");

		// Single Tab
		String parentWindowHandle1 = driver.getWindowHandle();
		System.out.println("Parent window handle - "+parentWindowHandle1 + driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String windowHandle1 : windowHandles1) {
			if(!windowHandle1.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle1);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Shiva");

		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
