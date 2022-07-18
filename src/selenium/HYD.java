package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		WebElement e=driver.findElement(By.id("firstName"));
		e.sendKeys("shiva");
		
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("lastname");
		
		driver.findElement(By.id("femalerb")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		
		hindiChk.click(); // check
		
		Thread.sleep(3000);
		
		if(hindiChk.isSelected())
			hindiChk.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		
		System.out.println(driver.findElement(By.id("msg")).getText());
		
	//	Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
	}


	}


