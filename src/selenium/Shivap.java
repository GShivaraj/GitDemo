package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shivap {

	public static void main(String[] args) throws InterruptedException {



		WebDriver driver = new ChromeDriver();
		driver.get("http://ourjobsol.com/index.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.cssSelector("a[href='contact_us.html']")).click();
Thread.sleep(3000);

driver.close();
driver.quit();


	}

}
