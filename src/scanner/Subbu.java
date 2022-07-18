package scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subbu {

	public static void main(String[] args) throws InterruptedException {
		WebDriver amazon=new ChromeDriver();
		amazon.get("https://www.amazon.in/");
		amazon.findElement(By.id("twotabsearchtextbox")).sendKeys("fridge");
		Thread.sleep(5000);
		WebElement a=amazon.findElement(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[2]/div/div"));
		a.click();
		Thread.sleep(3000);
		WebElement a1=amazon.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[10]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		a1.click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)amazon;
		js.executeAsyncScript("0",300);
		
		
	}

}
