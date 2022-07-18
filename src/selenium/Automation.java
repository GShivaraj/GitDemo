package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[6]")).click();
		
		String t=driver.getCurrentUrl();
		System.out.print(t);
		Thread.sleep(3000);
	driver.quit();

	}

}
