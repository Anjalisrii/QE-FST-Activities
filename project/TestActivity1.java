package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyWebsiteTitle() {
        driver.get("https://alchemy.hguy.co/lms");
        String aclTitle = driver.getTitle();
        String exTitle = "Alchemy LMS – An LMS Application";

        System.out.println("Actual Title: " + aclTitle);
        Assert.assertEquals(aclTitle, exTitle,
                "Title does not match!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}