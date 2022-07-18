package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		 WebElement
		  firstAlert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		  firstAlert.click();
		  
		  // Handling alert
		 
		  org.openqa.selenium.Alert alert=driver.switchTo().alert();
		  
		 alert.accept();// click on Ok alert.dismiss();//click on cancel
		 	
		
		WebElement timerAlert=driver.findElement(By.id("promtButton"));
		timerAlert.click();
		//Thread.sleep(6000);
		org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		String alertText=alert1.getText();
		System.out.println(alertText);
		alert1.sendKeys("jbdhjfj");
		Thread.sleep(3000);
		
		alert1.accept();

	}

}
