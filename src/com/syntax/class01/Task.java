package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");// 2 -path where is driver is located
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/"); // navigate
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
