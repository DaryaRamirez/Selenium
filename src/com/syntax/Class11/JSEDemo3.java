package com.syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEDemo3 {
    public static String url = "https://www.google.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open('http://amazon.com');");
        driver.get(url);
        driver.get("fb.com");//if we need to open different pages on same tab

        WebElement searchBar= driver.findElement(By.name("q"));
        searchBar.sendKeys("dlkdmlksdmls");


    }
}