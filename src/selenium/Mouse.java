package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		Actions a=new Actions(d);
		d.get("");
		d.findElement(By.id(""));
		d.findElement(By.id(""));
		d.findElement(By.id(""));
	
		
		a
		.moveToElement(d.findElement(By.id("")));

		
		
		
	}

	

}
