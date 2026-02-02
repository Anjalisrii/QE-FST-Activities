package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        // Launch browser
        FirefoxDriver driver =new FirefoxDriver();
        // Open URL
        driver.get("https://training-support.net/webelements/login-form/");

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Find username field and enter value
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");

        // Find password field and enter value
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");

        // Find login button and click
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        loginButton.click();

        // Close browser
        driver.quit();
    }
}