package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		
		Select courseNameDropdown = new Select(courseElement);
		
		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
		Thread.sleep(4000);
		
		
		for (WebElement option : courseNameDropdownOptions) {
			System.out.println(option.getText());
		}
		courseNameDropdown.selectByIndex(1);
		Thread.sleep(5000);
		courseNameDropdown.selectByValue("net"); 
		Thread.sleep(6000);
		courseNameDropdown.selectByVisibleText("Javascript"); 
		Thread.sleep(7000);

		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text - " +selectedText);

		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);
		Thread.sleep(6000);
		
		
		
		
		
		ideDropdown.selectByValue("ij"); 
		Thread.sleep(6000);
		ideDropdown.selectByVisibleText("NetBeans"); 
		Thread.sleep(6000);

		ideDropdown.deselectByVisibleText("IntelliJ IDEA");

		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text - " +selectedOption.getText());
			Thread.sleep(3000);
			
			driver.quit();
			
		
		}
	}
}



