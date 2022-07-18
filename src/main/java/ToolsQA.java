import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolsQA {
    static WebDriver driver;
    @BeforeTest

    void ToolsQA(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/forms");
    }
    @Test
    void PracticeForm(){
        driver.findElement(By.cssSelector("#item-0")).click();


    }
}
