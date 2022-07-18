import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import java.util.Random;

public class DemoQA {
    public static void main(String[]agrs) throws InterruptedException {
        Random r=new Random();
        WebDriverManager.chromedriver().setup();
        WebDriver f=new ChromeDriver();
        // Lunch the Website
        f.get("https://demoqa.com/forms");

        //Click on practice form page
        //Find the locator value

        String practiceForm="(//*[@id=\"item-0\"])[2]";
        WebElement g=f.findElement(By.xpath(practiceForm));
        g.click();
        //open the window maximize

        f.manage().window().maximize();

        //filling the Student Registration Form
        //fill Firstname

        String FirstName="//*[@id='firstName']";
        WebElement d=f.findElement(By.xpath(FirstName));
        d.sendKeys("Shiva");

        //useing implicitlyWate

       // f.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(3000);
        String LastName="//*[@id='lastName']";
        WebElement n=f.findElement(By.xpath(LastName));
        n.sendKeys("Gonepalli");
        String Emial="//*[@placeholder=\"name@example.com\"]";
        WebElement s=f.findElement(By.xpath(Emial));
        s.sendKeys("Shiva"+r.nextInt(100)+"@gmail.com");
        Thread.sleep(3000);
        //click on radio buttons
        String RadioButtons="(//input[@id=\"gender-radio-2\"]";
      WebElement w=  f.findElement(By.xpath(RadioButtons));
      w.click();
        Thread.sleep(3000);
      // Enter the moblie number
        String MoblieNumber="//input[@placeholder=\"Mobile Number\"]";
        WebElement m=f.findElement(By.xpath(MoblieNumber));
        m.sendKeys("1234567890");
        Thread.sleep(3000);
        //Enter in Date of Birth
        String DateOfBirth="//input[@id=\"dateOfBirthInput\"]";
        WebElement a=f.findElement(By.xpath(DateOfBirth));
        a.sendKeys("03-nov-95");
        Thread.sleep(3000);
        //enter subject
        String Subject="//*[@id=\"subjectsContainer\"]/div/div[1]";
        WebElement c=f.findElement(By.xpath(Subject));
        c.sendKeys("Testing job ");

        Thread.sleep(5000);







    }
}
