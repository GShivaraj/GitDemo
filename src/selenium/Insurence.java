package selenium;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insurence {

	public static void main(String[] args) {
		
		WebDriver as= new ChromeDriver();
		as.get("https://www.policybazaar.com/?pb_source=google&pb_medium=cpc&pb_term=Insurance&pb_campaign=Insurance_generic00Generic&gclid=EAIaIQobChMIppHg1YTN9QIV9pNmAh089wP7EAAYASAAEgJBQPD_BwE");
		
as.findElement(By.xpath("(//div[@class='prd-icon add short'])[2]")).click();
as.findElement(By.className("gender male")).click();
as.findElement(By.className("fullname")).sendKeys("gonepalli");
as.findElement(By.className("field mobileFld field_web")).sendKeys("8328302651");

	}

}
