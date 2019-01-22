package ketpa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class srdjan{
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "http://demowebshop.tricentis.com/";
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/MTTPP/chromedriver.exe");
        //Create a new ChromeDriver
        driver = new ChromeDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
    }
     @Test
    public void register() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement regInBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        regInBtn.click();
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
        gender.click();
        Thread.sleep( 1000);
        WebElement first = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        first.sendKeys("Srdjan");
        Thread.sleep( 1000);
        WebElement last = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
        last.sendKeys("Dragas");
        Thread.sleep( 1000);
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("sdragas11111111111@etfos.hr");
        Thread.sleep( 1000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("112233");
        WebElement cpass = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        cpass.sendKeys("112233");
        Thread.sleep( 1000);
        WebElement conf = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        conf.click();
        Thread.sleep( 1000);
        WebElement cont = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input"));
        cont.click();
    }
    @Test
   public void register_same_mail() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement regInBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        regInBtn.click();
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
        gender.click();
        Thread.sleep( 1000);
        WebElement first = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        first.sendKeys("Srdjan");
        Thread.sleep( 1000);
        WebElement last = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
        last.sendKeys("Dragas");
        Thread.sleep( 1000);
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("sdragas1111@etfos.hr");
        Thread.sleep( 1000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("112233");
        WebElement cpass = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        cpass.sendKeys("112233");
        Thread.sleep( 1000);
        WebElement conf = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        conf.click();
        Thread.sleep( 1000);
  }
     @Test
    public void login() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement logInBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        logInBtn.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("sdragas111@etfos.hr");
        Thread.sleep( 1000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("112233");
      Thread.sleep( 1000);
      WebElement log = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
      log.click();
      Thread.sleep( 1000);
    }
    @Test
    public void login_wrong_pass() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement logInBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        logInBtn.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("sdragas111@etfos.hr");
        Thread.sleep( 1000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("1122334");
        Thread.sleep( 1000);
        WebElement log = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        log.click();
        Thread.sleep( 1000);
    }
    @Test
    public void login_wrong_email() throws InterruptedException {
        //driver.manage().window().maximize();
        WebElement logInBtn = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        logInBtn.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("sdragas1111111@etfos.hr");
        Thread.sleep( 1000);
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("1122334");
        Thread.sleep( 1000);
        WebElement log = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        log.click();
        Thread.sleep( 1000);
    }



    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
