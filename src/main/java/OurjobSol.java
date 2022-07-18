
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OurjobSol {
    public static void main(String[] agrs) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://ourjobsol.com/");
        driver.manage().window().fullscreen();
        WebElement
       e= driver.findElement(By.xpath("//a[.='CONTACT']"));
        e.click();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("0", 100);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[2]/input")).sendKeys("Shiva");
  WebElement  e1=    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[3]/input"));
    e1.sendKeys("sivagtesting123@gmail.com");

    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[4]/input")).sendKeys("Tesing");
 Thread.sleep(3000);

    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[5]/input")).sendKeys("2.5 Years");

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[6]/textarea")).sendKeys("jab");

        Thread.sleep(3000);

      driver.findElement(By.xpath("//*[@id=\"image\"]")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Aspion company\\SIVA New Resume (2).pdf");
        Thread.sleep(3000);

      driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form/div/div[8]/div/button")).submit();
String f=driver.getCurrentUrl();
System.out.println(f);
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/div/div[2]/div[1]/ul/li[2]/a/i")).click();

driver.findElement(By.xpath("//*[@id=\"top-of-page\"]/div[1]/div[1]/div[1]/header/div/div[2]/span[1]/a[1]/h5")).click();


    }

}