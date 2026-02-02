package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Activity15 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        driver.manage().window().maximize();

        System.out.println("Page Title: " + driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Random random = new Random();
        int rand = 1000 + random.nextInt(9000);

        String fullName = "Test User " + rand;
        String email = "user" + rand + "@test.com";
        String eventDate = "25/12/2026";
        String details = "Selenium Dynamic Attributes Testing";

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[contains(@id,'full-name')]")
                )
        ).sendKeys(fullName);

        driver.findElement(
                By.xpath("//input[contains(@id,'email')]")
        ).sendKeys(email);

        driver.findElement(
                By.xpath("//*[@id='signInForm']/input[3]")
        ).sendKeys(eventDate);

        driver.findElement(
                By.xpath("//textarea[contains(@id,'additional-details')]")
        ).sendKeys(details);

        driver.findElement(
                By.xpath("//*[@id='signInForm']/button")
        ).click();

        String successMessage = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id='action-confirmation']")
                )
        ).getText();

        System.out.println("Success Message: " + successMessage);

        driver.quit();
    }
}