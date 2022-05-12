package com.syntax.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static String url="https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement alertBoxButton= driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertBoxButton.click();
        Alert alertBox=driver.switchTo().alert();
        Thread.sleep(2000);
        alertBox.accept();

        WebElement confirmBoxButton= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmBoxButton.click();
        Alert confirmBox=driver.switchTo().alert();
        Thread.sleep(2000);
        confirmBox.dismiss();

        WebElement promptBoxButton= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptBoxButton.click();
        Alert promptBox=driver.switchTo().alert();
        Thread.sleep(2000);

        promptBox.sendKeys("Bart");
        Thread.sleep(2000);
        promptBox.accept();

        driver.quit();

    }
}
