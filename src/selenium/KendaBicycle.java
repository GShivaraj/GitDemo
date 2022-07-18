package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KendaBicycle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.driver.chrome", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bicycle.kendatire.com/en-eu/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li[1]/a")).click();
		Select o=new Select(driver.findElement(By.xpath(" //select[@data-ng-options='option.name for option in activities']")));
		o.selectByValue("5");
WebElement p=driver.findElement(By.xpath("(//span[@class='pseudo-label'])[2]"));
p.click();
 

	}

}
