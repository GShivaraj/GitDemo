import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertClass {
   WebDriver driver;
   @BeforeTest
    void setup(){


      // System.setProperty("webdriver.chrome.driver","\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test
    void LogoTest(){

        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo not displayed on the page");
    }
}
