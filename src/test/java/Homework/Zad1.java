package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1295, 730));

        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signInLink = driver.findElement(By.className("user-info"));
        signInLink.click();
        WebElement createAcount = driver.findElement(By.xpath("(//a[normalize-space()='No account? Create one here'])[1]"));
        createAcount.click();
        driver.navigate().back();
        driver.navigate().back();
        driver.quit();



    }
}

