package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zad4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1295, 730));

        driver.navigate().to("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1");
        WebElement socialTitle = driver.findElement(By.xpath("//label[@for='field-id_gender']"));
        WebElement firstName = driver.findElement(By.xpath("//input[@id='field-firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='field-lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@id='field-email']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='field-password']"));
        WebElement show = driver.findElement(By.xpath("//button[@type='button']"));
        WebElement brithDate = driver.findElement(By.xpath("//input[@id='field-birthday']"));
        firstName.sendKeys("Karolina");
        lastName.sendKeys("Lenda");
        email.sendKeys("karolina@wp.pl");
        password.sendKeys("passeww");
        show.click();
        brithDate.sendKeys("MM/DD/YYYY");


        driver.quit();


    }
}
