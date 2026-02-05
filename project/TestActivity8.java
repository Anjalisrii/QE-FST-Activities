package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestActivity8 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void contactAdmin() {

        driver.findElement(By.linkText("Contact")).click();

        driver.findElement(By.id("wpforms-8-field_0"))
                .sendKeys("AAAA");

        driver.findElement(By.id("wpforms-8-field_1"))
                .sendKeys("AAAA@gmail.com");

        driver.findElement(By.id("wpforms-8-field_3"))
                .sendKeys("Test Subject");

        driver.findElement(By.id("wpforms-8-field_2"))
                .sendKeys("This is a test message sent using Selenium Firefox.");

        driver.findElement(By.id("wpforms-submit-8")).click();

        WebElement message = driver.findElement(By.id("wpforms-confirmation-8"));
        System.out.println("Confirmation Message: " + message.getText());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}