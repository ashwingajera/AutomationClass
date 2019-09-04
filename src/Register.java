import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Register {


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
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class = 'ico-register']")).click();

        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Ashwin");

        //enter last name
        driver.findElement(By.id("LastName")).sendKeys("Gajera");

        //enter email
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("gajeraashwin2@gmail.com");

        //enter password
        driver.findElement(By.name("Password")).sendKeys("Venus@8");

        //enter confirmed password
        driver.findElement(By.xpath("//input[@data-val-equalto-other=\"*.Password\"]")).sendKeys("Venus@8");

        //click on register
        driver.findElement(By.id("register-button")).click();

//        //close the browser window
        driver.close();













    }




}
