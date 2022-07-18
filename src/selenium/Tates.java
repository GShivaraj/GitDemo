package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tates {

	public static void main(String[] args) throws InterruptedException {
		Random random=new Random();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tatesbakeshop.com/");
		driver.manage().window().fullscreen();
		
		
		String t=driver.getCurrentUrl();
		System.out.println(t);
		
		driver.findElement(By.xpath("//input[@id=\"ltkpopup-email\"]")).sendKeys("pardhu"+random.nextInt(10)+"@gamil.com");
		Thread.sleep(4000);
		
		driver.findElement(By.id("ltkpopup-submit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ltkpopup-phone")).sendKeys("9"+random.nextDouble(8)+"6");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ltkpopup-close'])[1]")).click();
		
		Thread.sleep(3000);
	WebElement g=driver.findElement(By.xpath("//div[@class='account-top-wrapper']"));
	
	g.click();
	
	Thread.sleep(3000);
	driver.manage().window().fullscreen();
	
	driver.findElement(By.name("login[username]")).sendKeys("Shiva"+random.nextInt(100)+"@gmai.com");
	
	driver.findElement(By.name("login[password]")).sendKeys("9"+random.nextDouble(8)+"2");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	
	String y=driver.getCurrentUrl();
	System.out.println(y);
	
	driver.findElement(By.xpath("(//a[@class='ammenu-link -main -parent'])[1]")).click();
	
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("0",200);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='product-image-container'])[1]")).click();
	
	driver.findElement(By.className("qty-increase")).click();
	
	
	Thread.sleep(3000);
	
WebElement a=	driver.findElement(By.id("product-addtocart-button"));
	a.click();
	
	WebElement s= driver.findElement(By.className("action delete"));
	
	s.click();
	
	
	
	
	}

}
