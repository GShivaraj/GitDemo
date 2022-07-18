package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Food1 {

	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		
		WebDriver dr=new ChromeDriver();
		
		
		dr.get("https://www.fiahomefoods.com/customer-registration");
		dr.manage().window().fullscreen();
		dr.findElement(By.name("full_name")).sendKeys("xyz");
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("xyz."+r.nextInt(50)+"@gmail.com");
		dr.findElement(By.xpath("//*[@id='password']")).sendKeys("1234567890");
		Thread.sleep(3000);
		WebElement s=dr.findElement(By.xpath("//input[@id='password_confirm']"));
		s.sendKeys("1234567890");
		Thread.sleep(2000);
		dr.navigate().refresh();
		dr.navigate().to("https://www.makemytrip.com/");
		
String f=dr.getCurrentUrl();
System.out.println(f);
dr.findElement(By.className("loginModal displayBlock modalLogin dynHeight personal")).click();

String t=dr.getTitle();
System.out.println(t);

Thread.sleep(5000);
dr.close();
dr.quit();
	}

}
