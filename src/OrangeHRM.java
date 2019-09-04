import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRM {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");


        // open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen
        driver.manage().window().fullscreen();

        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //enter username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");


        //enter password
        driver.findElement(By.xpath("//input[@autocomplete=\"off\" and @name=\"txtPassword\"]" )).sendKeys("admin123");

        //enter on login button
        driver.findElement(By.id("btnLogin")).click();

        //close the window browser
        driver.close();






}}
