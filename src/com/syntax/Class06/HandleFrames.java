package com.syntax.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);//switching focus on first available frame
        WebElement textbox=driver.findElement(By.id("name"));
        textbox.sendKeys("Batch 12 Forever");

        driver.switchTo().defaultContent();//switching back to main page
        WebElement alertButton= driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.switchTo().frame("iframe_a");
        textbox.clear();
        textbox.sendKeys("we are back to frame");

        driver.switchTo().defaultContent();
        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement);
        textbox.clear();
        textbox.sendKeys("Hold your horses");
    }
}