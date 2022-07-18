package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;

public class Elemennts extends Anthem{
	public void ele() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='top-nav secondary']")).click();
		

		
	
		Thread.sleep(5000);

		driver.close();

		driver.quit();
	}
}
 