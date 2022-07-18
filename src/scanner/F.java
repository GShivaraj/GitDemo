package scanner;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.findElement(By.className("_2doB4z")).click();
		
		driver.findElement(By.className("_3704LK")).sendKeys("fridge"+Keys.ENTER);
		//driver.findElement(By.className("_3704LK")).sendKeys("fridge");
		Thread.sleep(2000);
		driver.findElement(By.className("_4rR01T")).click();
		driver.manage().window().maximize();
String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				String childWindow = window;
				driver.switchTo().window(childWindow);
				String r=driver.getCurrentUrl(); 
				System.out.println("childWindow,"+r);

	}
		}
		driver.switchTo().window(parentWindow); 
		String e=driver.getCurrentUrl();
		System.out.println("parentWindow,"+ e);
	}
}
