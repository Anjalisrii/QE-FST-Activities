package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://training-support.net/webelements/tables");

            // Print page title
            System.out.println("Page Title: " + driver.getTitle());

            // Locate rows and columns using XPath
            List<WebElement> rows = driver.findElements(
                    By.xpath("//table/tbody/tr")
            );
            List<WebElement> columns = driver.findElements(
                    By.xpath("//table/thead/tr/th")
            );

            System.out.println("Number of Rows: " + rows.size());
            System.out.println("Number of Columns: " + columns.size());

            // Print all cells in 3rd row
            List<WebElement> thirdRowCells = driver.findElements(
                    By.xpath("//table/tbody/tr[3]/td")
            );

            System.out.println("Third Row Values:");
            for (WebElement cell : thirdRowCells) {
                System.out.println(cell.getText());
            }

            // Print value at 2nd row, 2nd column
            WebElement specificCell = driver.findElement(
                    By.xpath("//table/tbody/tr[2]/td[2]")
            );
            System.out.println("Cell (2nd row, 2nd column): " + specificCell.getText());

        } finally {
            driver.quit();
        }
    }
}