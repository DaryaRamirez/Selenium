package com.syntax.class02;
/*
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.findElement(By.partialLinkText( "Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("323-758-9988");
        driver.findElement(By.name("reg_passwd__")).sendKeys("12335");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_17_9_+j")).click();
        driver.quit();
    }
}
