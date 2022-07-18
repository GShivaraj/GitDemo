package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement
		  firstAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		 firstAlert.click();
		 
		 // Handling alert
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		  
		 org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		  
		  alert1.accept();// click on Ok alert.dismiss();//click on cancel
		 	
		
		WebElement timerAlert=driver.findElement(By.id("promtButton"));
		timerAlert.click();
		
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert1.sendKeys("te");
		
		
		alert.accept();
		
		
		
		
    
	}

	

}
