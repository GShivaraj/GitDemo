package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class FanFood {

	public static void main(String[] args) throws InterruptedException {
		
        Random r=new Random();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.fiahomefoods.com/customer-registration");

		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@placeholder='Full Name']")).sendKeys("Shiva Gonepalli");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9959128889");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gvshiva"+r.nextDouble(99)+"@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Pardhu"+r.nextDouble(46)+"143@");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password_confirm\"]")).sendKeys("Pardhu143@");
		Thread.sleep(3000);
		//dropdown
		
		Select cuntry=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		
		cuntry.selectByValue("India");
		
		Thread.sleep(3000);
		
		//state
		Select state=new Select(driver.findElement(By.xpath("//*[@id=\"state_dropdown\"]")));
		
		state.selectByValue("Andhra Pradesh");
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.xpath("//*[@id=\"address\"]"));

		address.sendKeys("2-207c,ilapavuluru");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("ongole");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"zip_code\"]")).sendKeys("523263");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"landmark\"]")).sendKeys("Ramalayamvedhi,ilapavuluru");

		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//*[@id=\"without-login-proceed\"]")).click();

driver.quit();


	}

}
