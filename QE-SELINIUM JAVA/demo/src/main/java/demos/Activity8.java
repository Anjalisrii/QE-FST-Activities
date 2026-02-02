package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open a new browser to the specified URL
        driver.get("https: //training-support.net/webelements/mouse-events");                                                 

                                                                
        String title = driver.getTitle();
        System.out.println(title);

                                      
        Actions actions = new Actions(driver);


        // Left click on the Cargo.lock button
        WebElement cargoLockButton = driver.findElement(By.xpath("//button[text()='Cargo.lock']"));
        actions.moveToElement(cargoLockButton).click().perform();
        String confirmationText1 = driver.findElement(By.xpath(" //div[@id='action-sequence']")).getText();                                         
        System.out.println(confirmationText1);

                                         
        String srcButton = driver.findElement(By.xpath("//div[@id='action-sequence']")).getText();
        System.out.println(confirmationText1);

        // Double click on the src button
        WebElement srcButton1 = driver.findElement(By.xpath("//button[text()='src']"));
        actions.doubleClick(srcButton1).perform();
        
        // Right click on the target button
        WebElement targetButton = driver.findElement(By.xpath("//button[text()='target']"));                             
        actions.contextClick(targetButton).perform();
        @SuppressWarnings("unused")
        WebElement confirmationText2 = driver.findElement(By.xpath("//button[text()='target']"));
        actions.contextClick(targetButton).perform();
        String confirmationText21 = driver.findElement(By.xpath("//div[@id='action-sequence']")).getText();
        System.out.println(confirmationText21);

        // Close the browser
        driver.quit();
    }
}