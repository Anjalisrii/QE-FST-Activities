package project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestActivity7 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void countNumberOfCourses() {
        driver.findElement(By.linkText("All Courses")).click();
        List<WebElement> courses = driver.findElements(
                By.xpath("//h3[@class='entry-title']")
        );
        System.out.println("Total number of courses: " + courses.size());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}