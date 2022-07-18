package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone {

	public static void main(String[] args) throws InterruptedException {
		WebDriver v=new ChromeDriver();
		v.get("https://www.apple.com/in/iphone/?afid=p238%7CsnTdg5ZpO-dc_mtid_209254ho67063_pcrid_600481769916_pgrid_135363319397_&cid=wwa-in-kwgo-iphone-slid----avail-");
		Thread.sleep(3000);
		v.findElement(By.xpath("//figure[@class='chapternav-icon']/following-sibling ::span[@class='chapternav-label']")).click();
	}

}
