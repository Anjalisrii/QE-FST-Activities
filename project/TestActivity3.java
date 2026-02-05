package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyFirstInfoBoxTitle() {

        driver.get("https://alchemy.hguy.co/lms");

        WebElement firstInfoBoxTitle = driver.findElement(
                By.xpath("(//h3)[1]")
        );

        String actualText = firstInfoBoxTitle.getText();
        String expectedText = "Actionable Training";

        System.out.println("First Info Box Title: " + actualText);

        Assert.assertEquals(actualText, expectedText,
                "First info box title does not match!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}