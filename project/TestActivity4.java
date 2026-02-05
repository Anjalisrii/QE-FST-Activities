
package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestActivity4 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void secpopcour() {

        List<WebElement> courseTitles = driver.findElements(
                By.xpath("//h3[@class='entry-title']")
        );

        String acTitle = courseTitles.get(1).getText();

        String expTitle = "Email Marketing Strategies";

        Assert.assertEquals(
                acTitle,
                expTitle,
                "Second most popular course title does not match!"
        );

        System.out.println("Verified successfully: " + acTitle);
    }

    @AfterClass
    public void dow() {
        driver.quit();
    }
}