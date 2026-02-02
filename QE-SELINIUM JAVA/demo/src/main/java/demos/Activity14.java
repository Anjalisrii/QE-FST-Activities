package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/tables");
            System.out.println("Page Title: " + driver.getTitle());
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table/tbody/tr")
            );
            List<WebElement> columns = driver.findElements(
                    By.xpath("//table/thead/tr/th")
            );

            System.out.println("Rows: " + rows.size());
            System.out.println("Columns: " + columns.size());
            WebElement bookBeforeSort = driver.findElement(
                    By.xpath("//table/tbody/tr[5]/td[2]")
            );
            
            System.out.println("Book Name (5th row before sort): "
                    + bookBeforeSort.getText());

            driver.findElement(
                    By.xpath("//table/thead/tr/th[contains(text(),'Price')]")
            ).click();
            WebElement bookAfterSort = driver.findElement(
                    By.xpath("//table/tbody/tr[5]/td[2]")
            );
            System.out.println("Book Name (5th row after sort): "
                    + bookAfterSort.getText());

        } finally {
            
            driver.quit();
        }
    }
}
