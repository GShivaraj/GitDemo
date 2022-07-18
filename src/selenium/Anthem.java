package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anthem {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://www.anthem.com/");
		
		
		
		String r3=driver.getPageSource();

		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//a[@id='topNavTab-1']")).click();
		
		Thread.sleep(7000);
	
		WebElement s=driver.findElement(By.xpath("//a[@data-analytics-name='Group Health Insurance']"));
		s.click();
		driver.manage().window().fullscreen();

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("0", 300);
		driver.findElement(By.xpath("//a[@data-analytics='learnMoreLgBusHealthInsEprMed']")).click();
		Thread.sleep(5000);
		WebElement a=driver.findElement(By.id("btnTopSelectStateNoStateSelected"));
		a.click();

		
		String r1=driver.getPageSource();
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.navigate().back();
		

		driver.findElement(By.xpath("(//a[@class='med'])[2]")).click();

		driver.findElement(By.id("medicare-topmenu-1527491998568")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@aria-label='Health & Wellness Resources']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"anthemHeaderContent\"]/div[2]/nav/div[1]/div[2]/div[2]/ul[2]/li[1]/a")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='searchBoxTopNav']")).sendKeys("Large Group");
		Thread.sleep(4000);
		WebElement 	p=driver.findElement(By.xpath("//a[@class='ant-spanish-link nav-item fwc-btn fwc-btn-primary langLink']"));
		p.click();
System.out.println(r3);
System.out.println(r1);

		String r2=driver.getPageSource();
		System.out.println(r2);
		 
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



		Elemennts obj=new Elemennts();
		obj.ele();
	}
	

}
