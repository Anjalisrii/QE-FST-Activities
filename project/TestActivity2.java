package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyWebsiteHeading() {
        driver.get("https://alchemy.hguy.co/lms");
        WebElement heading = driver.findElement(By.xpath("//h1"));
        String actHeading = heading.getText();
        String expHeading = "Learn from Industry Experts";
        System.out.println("Actual Heading: " + actHeading);
        Assert.assertEquals(actHeading, expHeading,
                "Heading text does not match!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}