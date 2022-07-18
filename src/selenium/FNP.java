package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FNP {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://www.fnp.com/");
		driver.manage().window().fullscreen();
		Actions s=new Actions(driver);

		s.moveToElement(driver.findElement(By.xpath("//a[@id='#valentinemenu']"))).build().perform();
		
		WebElement rt=driver.findElement(By.xpath("//*[@id=\"valentinemenu\"]/div/section[1]/ul/li[1]/a"));
		
rt.click();
driver.manage().window().fullscreen();
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id=\"valentinemenu\"]/div/section[1]/ul/li[1]/a")).click();

Objects obj=new Objects();
obj.ele();
	}

}
