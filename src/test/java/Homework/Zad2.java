package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Zad2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1295, 730));

        driver.navigate().to("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstNameInput.sendKeys("Karol");
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastNameInput.sendKeys("Kowalski");
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        WebElement gender = driver.findElement(By.xpath("(//label[normalize-space()='Male'])[1]"));
        gender.click();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.findElement(By.name("dob")).sendKeys("05/22/2010");
        driver.findElement(By.name("address")).sendKeys("Prosta 51");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("karol.kowalski@mailinator.com");
        driver.findElement(By.name("password")).sendKeys("Pass123");
        driver.findElement(By.name("company")).sendKeys("Coders Lab");
        driver.findElement(By.name("comment")).sendKeys("To jest mój pierwszy automat testowy");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        driver.quit();

    }
}
