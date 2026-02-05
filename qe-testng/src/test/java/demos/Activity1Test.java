package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1Test {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Create Firefox driver instance
        driver = new FirefoxDriver();

        // Open the website
        driver.get("https://training-support.net");
    }

    @Test
    public void testPageTitles() {
        // Get and print the title of the page
        String homeTitle = driver.getTitle();
        System.out.println("Home Page Title: " + homeTitle);

        // Assert home page title
        Assert.assertEquals(homeTitle, "Training Support");

        // Find "About Us" button and click
        driver.findElement(By.linkText("About Us")).click();

        // Get and print new page title
        String aboutTitle = driver.getTitle();
        System.out.println("About Us Page Title: " + aboutTitle);

        // Assert new page title
        Assert.assertEquals(aboutTitle, "About Training Support");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.close();
    }
}