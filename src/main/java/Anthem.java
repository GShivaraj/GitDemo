import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Anthem {
    static WebDriver driver;
     
    @BeforeTest
    void AnthemURL() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("https://www.anthem.com/");
driver.manage().window().maximize();
        String s=driver.getTitle();
        System.out.println(s);
        WebElement a= driver.findElement(By.xpath("//a[.='Log In']"));
        a.click();
Thread.sleep(3000);


    }
    @Test
    void ForMembers(){
driver.findElement(By.xpath("//*[@id=\"mbr-page-wrapper\"]/div[2]/div[2]/div/main/div[2]/div/div/div/div/div/div/ul/li[1]/a")).click();


    }

}

