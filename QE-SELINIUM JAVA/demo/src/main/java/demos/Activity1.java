package demos;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        FirefoxDriver driver =new FirefoxDriver();

        //go to page
        driver.get("https://training-support.net");

        // print title
        System.out.println(driver.getTitle());
        //click on button
        driver.findElement(By.linkText("About Us")).click();
        System.out.println(driver.getTitle());
        //close the browser
        driver.quit();
    }

}
