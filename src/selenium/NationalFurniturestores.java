package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NationalFurniturestores {

	public static void main(String[] args) throws InterruptedException {
		Random random =new Random();

		WebDriver avinash=new ChromeDriver();

		avinash.get("https://www.nationalfurniturestores.in/");
		avinash.manage().window().maximize();
		avinash.findElement(By.xpath("//span[@data-hover='Bedrooms']")).click();


		avinash.findElement(By.id("sm_megamenu_220")).click();


		JavascriptExecutor js=(JavascriptExecutor) avinash;
		js.executeScript("0", 300);
		avinash.findElement(By.xpath("//img[@id='product-collection-image-997']")).click();


		JavascriptExecutor ss=(JavascriptExecutor) avinash;
		ss.executeScript("0", 400);
		avinash.findElement(By.xpath("//*[@id='pincode']")).sendKeys("000000");
		//avinash.findElement(By.className("button pincode-button")).click();
		avinash.findElement(By.xpath("//span[@class='quantity-controls quantity-plus']")).click();
		WebElement gp=avinash.findElement(By.xpath("//button[@class='button btn-cart'and@id='product-addtocart-button']"));
		gp.click();
		avinash.findElement(By.xpath("//span[@class='sm_megamenu_title'and@data-hover='Living Room']")).click();
		JavascriptExecutor gs=(JavascriptExecutor) avinash;
		gs.executeScript("0", 500);
		avinash.findElement(By.id("product-collection-image-988")).click();


		avinash.findElement(By.xpath("//*[@name='email']")).sendKeys("xyz"+random.nextInt(1000)+"@gmail.com");
		//avinash.findElement(By.xpath("//button[@title='Subscribe']")).click();
		

		JavascriptExecutor gg=(JavascriptExecutor) avinash;
		gg.executeScript("0", 700);
		WebElement cv=avinash.findElement(By.xpath("//span[@class='quantity-controls quantity-plus']"));
		cv.click(); 







		JavascriptExecutor gr=(JavascriptExecutor) avinash;
		gr.executeScript("0", 1000);

		WebElement gv=avinash.findElement(By.xpath("//*[@name='input_2']"));    
		gv.sendKeys("qwer");


		WebElement gopi	=avinash.findElement(By.id("product-collection-image-986"));
		gopi.click();
		Thread.sleep(3000);
		JavascriptExecutor sj=(JavascriptExecutor) avinash;
		sj.executeScript("0",400);

		WebElement shiva=avinash.findElement(By.xpath("//input[@id='pincode']"));
		shiva.sendKeys("523002");

		avinash.findElement(By.className("button pincode-button")). click();

		JavascriptExecutor g=(JavascriptExecutor) avinash;
		g.executeScript("0",500);

		avinash.findElement(By.name("input_2")).  sendKeys("Shiva Gonepalli");


		avinash.findElement(By.className("")).sendKeys("");
		
		
		avinash.findElement(By.xpath("//span[@data-hover='Modular Kitchen']")).click();


	}

}
