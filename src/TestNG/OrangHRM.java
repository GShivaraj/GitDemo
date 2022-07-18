 package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrangHRM {
WebDriver drive;

@BeforeMethod
	public void testMethod1() {
		drive=new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("URL ");
	}

	@Test(priority=1)
	public void testMethod2() throws Exception {
		highlight(drive, drive.findElement(By.id("txtUsername")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.id("txtPassword")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.id("btnLogin")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.linkText("Forgot your password?")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.id("logInPanelHeading")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.xpath("//*[@id=\"content\"]/div[2]/span")));
		Thread.sleep(3000);
		highlight(drive, drive.findElement(By.id("divLogo")));
	
		System.out.println("highlight");
	}

	public void highlight(WebDriver drive2, WebElement findElement) {
		JavascriptExecutor js = (JavascriptExecutor) drive;
		
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid yellow ; background:block')", findElement);
		
	}

	@Test(priority=2)
	public void beforeMethod() throws InterruptedException {
		drive.findElement(By.id("txtUsername")).sendKeys("Admin");
		drive.findElement(By.id("txtPassword")).sendKeys("admin123");
		drive.findElement(By.id("btnLogin")).click();
		System.out.println("Login page");
		Thread.sleep(3000);
		drive.manage().window().fullscreen();
		highlight1(drive,drive.findElement(By.id("menu_admin_viewAdminModule")));
		Thread.sleep(3000);
		//drive.manage().window().fullscreen();
		highlight1(drive,drive.findElement(By.id("menu_pim_viewPimModule")));
		Thread.sleep(3000);

		highlight1(drive,drive.findElement(By.id("menu_leave_viewLeaveModule")));
		Thread.sleep(3000);

		highlight1(drive,drive.findElement(By.id("menu_time_viewTimeModule")));
		Thread.sleep(3000);

		highlight1(drive,drive.findElement(By.id("menu_recruitment_viewRecruitmentModule")));
		Thread.sleep(3000);

		highlight1(drive,drive.findElement(By.id("menu_pim_viewMyDetails")));
		Thread.sleep(3000);

		highlight1(drive,drive.findElement(By.id("menu__Performance")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("menu_dashboard_index")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("menu_directory_viewDirectory")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("menu_maintenance_purgeEmployee")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("menu_buzz_viewBuzz")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("MP_link")));
		Thread.sleep(3000);
		highlight1(drive,drive.findElement(By.id("welcome")));
		
		System.out.println("Shiva");
	}
	
	
	public void highlight1(WebDriver drive2, WebElement findElement) {
		JavascriptExecutor js = (JavascriptExecutor) drive;
		
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid blue; background:white')", findElement);
		
	}
	@Test(priority=3)
public void Leve() {
	drive.findElement(By.id("menu_leave_viewMyLeaveBalanceReport")).click();
	
}
	@AfterMethod
	public void beforeClass() {
	//	drive.findElement(By.id("menu_admin_viewAdminModule")).click();
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}

	@AfterSuite
	public void afterSuite() throws InterruptedException {
		System.out.println("afterSuite");
		Thread.sleep(3000);
		drive.close();
		drive.quit();
		
	}

}
