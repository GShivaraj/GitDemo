package scanner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OJS {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://sdacdemy.co.in/mail.html");
		d.findElement(By.name("name")).sendKeys("shiva");
		d.findElement(By.name("email")).sendKeys("sivagtesting123@gmail.com");
		d.findElement(By.name("message")).sendKeys("Test lead");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\ADMIN\\Downloads\\tester resume 4.docx");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
