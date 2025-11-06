package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class LaunchBrowser {

    @Test
    public void launchBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Palak Rai");

        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@aria-label='palak rai']")).click();

        driver.quit();
    }
}
