package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//driver.switchTo().frame("frame1");
		WebElement frameEle=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frameEle);
		
		List<WebElement> eles=driver.findElements(By.id("sampleHeading"));
		int noOfElements=eles.size();
		System.out.println(noOfElements);

	}

}
