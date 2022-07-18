package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bus {

	public static void main(String[] args) throws InterruptedException {
		
		String baseURL="https://www.youtube.com/";
	    WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		
		
		
		
		
		String e=driver.getCurrentUrl();
		
		String t=driver.getTitle();
		
		String y=driver.getWindowHandle();
		
		
		
		System.out.println(e);
		
		System.out.println(t);
		
		System.out.println(y);
		
	
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
