package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/drag-drop");

            // Print page title
            System.out.println("Page Title: " + driver.getTitle());

            Actions actions = new Actions(driver);

            WebElement ball = driver.findElement(By.id("ball"));
            WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
            WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

            // Drag ball to Dropzone 1
            actions.dragAndDrop(ball, dropzone1).perform();

            // Verify Dropzone 1
            String text1 = dropzone1.getText();
            if (text1.contains("Dropped")) {
                System.out.println("Ball entered Dropzone 1");
            }

            // Drag ball to Dropzone 2
            actions.dragAndDrop(ball, dropzone2).perform();

            // Verify Dropzone 2
            String text2 = dropzone2.getText();
            if (text2.contains("Dropped")) {
                System.out.println("Ball entered Dropzone 2");
            }

        } finally {
            driver.quit();
        }
    }
}