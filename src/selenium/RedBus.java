package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RedBus {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.redbus.in/bus-tickets");
		
		d.manage().window().fullscreen();
		d.findElement(By.id("txtSource")).click();
		d.findElement(By.id("txtSource")).sendKeys("hyd");
		
		Select s=new Select(d.findElement(By.xpath("//li[@class='C120_slist-item'and@data-ind='2']")));
		
		s.selectByVisibleText("Secunderabad, ");
		
		

	}

}
