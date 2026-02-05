package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestActivity5 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyMyAccountPage() {
        driver.findElement(By.linkText("My Account")).click();
        String aTitle = driver.getTitle();
        String eTitle = "My Account – Alchemy LMS";
        Assert.assertEquals(
                aTitle,
                eTitle,
                "You are NOT on My Account page!"
        );

        System.out.println("Successfully navigated to My Account page");
    }

    @AfterClass
    public void clo() {
        driver.quit();
    }
}