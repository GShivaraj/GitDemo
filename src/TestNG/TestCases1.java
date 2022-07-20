package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases1 {
	@Test
	public void TestCases() {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle1());
		System.out.println(driver.getTitle2());
		System.out.println(driver.getTitle3());
		System.out.println(driver.getTitle4());
		System.out.println(driver.getTitle5());
		System.out.println(driver.getTitle6());
		System.out.println(driver.getTitle7());
		System.out.println(driver.getTitle8());
		System.out.println(driver.getTitle9());
		System.out.println(driver.getTitle10());
		System.out.println(driver.getTitle11());
		System.out.println(driver.getTitle12());
		System.out.println(driver.getTitle13());
		System.out.println(driver.getTitle14());
		System.out.println(driver.getTitle15());
		
		
	System.out.println(driver.getTitle());
		
	}
	@BeforeTest
	public void BasicUrl{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
	}

}
