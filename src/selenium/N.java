package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class N {

	public static void main(String[] args) throws InterruptedException {
		WebDriver A=new ChromeDriver();
		A.get("https://www.google.com/");
		
		A.findElement(By.name("q")).sendKeys("gmail");
		A.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		A.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		A.navigate().back();
		

	}

}
