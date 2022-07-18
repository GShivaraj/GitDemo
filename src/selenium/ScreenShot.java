package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot {

	//private static String fileWithPath;
	//private static TakesScreenshot webdriver;

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Convert web driver object to TakeScreenshot

      //  TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        //        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

         //       File DestFile=new File(fileWithPath);

                //Copy file at destination

        //        FileUtils.copyFile(SrcFile, DestFile);

		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\ScreenShot\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		//screenshot of section/portion of the page
		
		WebElement section=driver.findElement(By.id("panel_wrapper_0"));
		File src1=section.getScreenshotAs(OutputType.FILE);
		File trg1=new File(".\\ScreenShot\\panel_wrapper.png");
		FileUtils.copyFile1(src1, trg1);
		
		//Screenshot in web element
		
	/*	WebElement ele=driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]/img"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File.trg=new File(".\\ScreenShot\\logo.png");
		FileUtils.copyFile(src, trg);
		*/ 
		
		
		
		//driver.quit();

	}

	
		
	}


