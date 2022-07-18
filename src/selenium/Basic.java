package selenium;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;


public class Basic {
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//URL

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad time: "+duration.toMillis() + " milli seconds");
		
		System.out.println(driver.getTitle());

		//LOGIN FUNCTION
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String s=driver.getCurrentUrl(); 
		System.out.println("Url,"+ s);

	



		//WEB APPLICTION

		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("PICHI MANISHA");
		
		//drop down
		
		Select All=new Select(driver.findElement(By.name("searchSystemUser[userType]")));
		All.selectByVisibleText("Admin");
		All.selectByValue("2");
		All.selectByIndex(2);
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("TEST Eng");
		//drop down
		
		Thread.sleep(5000);
		All.selectByVisibleText("All");
		All.selectByIndex(0);
		All.selectByValue("0");
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.className("arrow")).click();
		
//Actions class
		
			Actions shiva=new Actions(driver);
		shiva.moveToElement(driver.findElement(By.id("menu_admin_viewJobTitleList"))).build().perform();

		 
			All.selectByVisibleText("ESS");
		All.selectByValue("2");
		driver.findElement(By.className("formInputText inputFormatHint ac_input")).sendKeys("PICHI MANISHA");
		driver.findElement(By.className("formInputText")).sendKeys("PICHI PRIYANKA");
		All.selectByVisibleText("Disabled");
		All.selectByValue("0");
		driver.findElement(By.className("formInputText password")).sendKeys("MANISHA");
		driver.findElement(By.className("formInputText password")).sendKeys("MANISHA"); 
		 
		//SCROOL BAR

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("0", 200);
		driver.findElement(By.id("btnSave")); 

		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		driver.findElement(By.id("menu_leave_applyLeave")).click();
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='leaveList[chkSearchFilter][]'and@id='leaveList_chkSearchFilter_3']")).click();
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
		driver.findElement(By.id("menu_time_Timesheets")).click();
		driver.findElement(By.className("ac_input")).sendKeys("PICHI MANISHA");
		//scroll bar
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("scroll(0,100)");

		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		JavascriptExecutor js2=(JavascriptExecutor) driver;
		js2.executeScript("scroll(0,200)");

		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		driver.findElement(By.id("menu_dashboard_index")).click();
		driver.findElement(By.xpath("//a[@id='menu_maintenance_purgeEmployee'and@class='firstLevelMenu']")).click();
		driver.findElement(By.id("menu_maintenance_accessEmployeeData")).click();

		JavascriptExecutor js3=(JavascriptExecutor) driver;

		js3.executeScript("scroll(0,200)");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Acharya movie 1234567890");
		driver.findElement(By.xpath("//input[@value='Verify']")).click();
		
		driver.findElement(By.id("menu_buzz_viewBuzz")).click();
		
		driver.findElement(By.id("tabLink1")).click();
	
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("createPost[content]")).sendKeys("PICHI MANISHA");
		driver.findElement(By.id("postSubmitBtn")).click();
		
		
		driver.findElement(By.id("tabLink2")).click();
		
		driver.findElement(By.id("tabLink3")).click();


		
		driver.findElement(By.id("menu_leave_assignLeave")).click();


		driver.findElement(By.name("leaveList[calFromDate]")).click();


			driver.findElement(By.name("leaveList[calToDate]")).click();
		 

		
	}

}
