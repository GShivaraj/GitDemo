package selenium;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String e=driver.getCurrentUrl();

		String t=driver.getTitle();

		String y=driver.getWindowHandle();

		String a=driver.getPageSource();
		System.out.println(e);

		System.out.println(t);

		System.out.println(y);

		System.out.println(a);
 

		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("https://www.anthem.com/");
		String e1=driver.getCurrentUrl();

		String t1=driver.getTitle();

		String y1=driver.getWindowHandle();

		String a1=driver.getPageSource();
		System.out.println(e1);
		System.out.println(t1);

		System.out.println(y1);

		System.out.println(a1);


		Thread.sleep(4000);
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		
		String e2=driver.getCurrentUrl();
		
		System.out.println(e2);

		String t2=driver.getTitle();

		String y2=driver.getWindowHandle();

		String a2=driver.getPageSource();

		System.out.println(t2);

		System.out.println(y2);

		System.out.println(a2);


		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("shiva"+r.nextInt(10)+"@gmali.com");
		Thread.sleep(7000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(4000);

		driver.navigate().to("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oopA3s");

		driver.findElement(By.id("twotabsearchtextbox")).submit();

		Thread.sleep(4000);
		driver.navigate().refresh();


		Thread.sleep(3000);
		driver.quit();

	}

}
