import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EmailToFriend {

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

        //click on apple Apple MacBook Pro 13-inch on home page
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();

        //click on email a friend button
        driver.findElement(By.xpath("//input[@class='button-2 email-a-friend-button']")).click();

        //enter friend email
        driver.findElement(By.name("FriendEmail")).sendKeys("ashwingajera2014@gmail.com");

        //enter your email
        driver.findElement(By.className("your-email")).sendKeys("gajeraashwin2@gmail.com");

        //enter message
        driver.findElement(By.id("PersonalMessage")).sendKeys("hi,Please have look this product");

        //click on send email button
        driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Send email\"]")).click();

        //close window browser
        driver.close();


    }}
