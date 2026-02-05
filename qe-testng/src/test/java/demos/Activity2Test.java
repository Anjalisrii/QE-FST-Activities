package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2Test {
    private WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");

    }
    @Test
    public void getTitle(){
        String title= driver.getTitle();
        System.out.println("Page Title :"+ title);
        Assert.assertEquals(title,"Selenium: Target Practice");
    }

    @Test
    public void blackbutton(){
        String buttonText=driver.findElement(By.cssSelector("button.black")).getText();
        Assert.assertEquals(buttonText,"White Button");
    }
    @Test(enabled = false)
    public void skippedTestDisabled(){
        System.out.println("This test is disabled");
    }
    @Test
    public void skippedTestException(){
        throw new SkipException("Skipping this test using skipException");
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }

}
