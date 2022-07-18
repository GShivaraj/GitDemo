
 package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HealthCare {
	
public static void main(String[] args) throws InterruptedException {
		
		
	Random random=new Random();
		
		WebDriver np=new ChromeDriver();
		
		np.manage().window().maximize();

		np.get("https://www.cognizant.com/us/en/industries/healthcare-technology-solutions");

		String s=np.getCurrentUrl();
		System.out.print(s);

		np.findElement(By.xpath("//a[@id='Industries']")).click();

		//np.findElement(By.xpath("//a[@id='Services']")).click();

		Actions shiva=new Actions(np);
		shiva.moveToElement(np.findElement(By.xpath("//a[@class='flex-container align-middle'and@title='Healthcare']"))).click().build().perform();

		

	

		shiva.moveToElement(np.findElement(By.xpath("//a[@title='READ MORE'and@class='small button arrow mb0']"))).click().build().perform();
		shiva.moveToElement(np.findElement(By.xpath("//*[@id=\"related-thinking\"]/div/div[2]/div[1]/div/div[2]/h5"))).click().build().perform();

		JavascriptExecutor js=(JavascriptExecutor) np;
		js.executeScript("0", 200);

		shiva.moveToElement(np.findElement(By.xpath("//*[@id=\"related-thinking\"]/div/div[2]/div[1]/div/div[3]"))).click().build().perform();
		shiva.moveToElement(np.findElement(By.xpath("(//a[@class='small white'])[1]"))).click().build().perform();
		//JavascriptExecutor gv=(JavascriptExecutor)np;
		//gv.executeAsyncScript("0", 400);
		np.findElement(By.xpath("//a[@class='button my-half medium-m0 small js-contact-widget']")).click();
		np.findElement(By.xpath("//*[@class='firstname']")).sendKeys("shiva gonepalli");
		
		np.findElement(By.xpath("//*[@id='emailid']")).sendKeys("shiva"+random.nextInt(150)+"@gmail.com");
		Thread.sleep(4000);
		np.findElement(By.xpath("//*[@class='organisation']")).sendKeys("cognizant");
		np.findElement(By.xpath("//*[@id='contact']")).sendKeys("9959128889");

		Select dc=new Select(np.findElement(By.id("region")));

		dc.selectByVisibleText("India");

		Select cd=new Select(np.findElement(By.xpath("//*[@id=\"enquiry\"]")));
		cd.selectByVisibleText("Alumni");

		np.findElement(By.xpath("//textarea[@id='Ccomment']")).sendKeys("Hii good evining this shiva ");
		Thread.sleep(6000);
		np.findElement(By.xpath("//button[@type='submit']")).click();

		
		Thread.sleep(2000);
		np.quit();

	}

}
