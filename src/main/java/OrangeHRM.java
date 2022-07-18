
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class OrangeHRM {
    static WebDriver driver;

    @Test(priority=1)
    void BasicURL(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test(priority=2)
    void LogIn(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test(priority=3)
void Admin() throws InterruptedException {

        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        WebElement f=driver.findElement(By.id("searchSystemUser_userName"));
        f.sendKeys("Aaliyah.Haq");

        Select a=new Select(driver.findElement(By.id("searchSystemUser_userType")));
        a.selectByValue("2");
        driver.manage().window().fullscreen();
        String r= driver.getTitle();
        System.out.println(r);
        String g=driver.getCurrentUrl();
        System.out.println(g);

driver.findElement(By.name("searchSystemUser[employeeName][empName]")).sendKeys("Aaliyah.Haq");
Select b=new Select(driver.findElement(By.name("searchSystemUser[status]")));
b.selectByValue("1");
driver.findElement(By.id("searchBtn")).click();
Thread.sleep(3000);

    }
    @Test(priority=4)
void Job() throws InterruptedException {
        driver.findElement(By.xpath("//a[.='Job']")).click();
        driver.manage().window().fullscreen();
driver.findElement(By.xpath("//b[.='PIM']")).click();
driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Peter Mac");
driver.findElement(By.name("empsearch[id]")).sendKeys("0007");
Select s=new Select(driver.findElement(By.name("empsearch[employee_status]")));
s.selectByValue("3");
Select g=new Select(driver.findElement(By.name("empsearch[termination]")));
g.selectByValue("2");
driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("John Smith");
Thread.sleep(3000);
Select e=new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_job_title\"]")));
e.selectByValue("227");
Thread.sleep(3000);

        Select d=new Select(driver.findElement(By.name("empsearch[sub_unit]")));
        d.selectByValue("2");

        driver.findElement(By.id("searchBtn")).click();

}
@Test(priority=5)
void Test() throws InterruptedException {
        String f= driver.getPageSource();
        System.out.println(f);
 Thread.sleep(2000);

}
@Test(groups={"regression","sanity"})
void MyInfo(){
        driver.findElement(By.xpath("//b[.='My Info']")).click();

}
    }

