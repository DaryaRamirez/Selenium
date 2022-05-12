package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1 {
    public static String url=" https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);


        String mainPageHandle = driver.getWindowHandle();
        WebElement newTabBtn= driver.findElement(By.cssSelector("button#tabButton"));
        WebElement newWindowBtn= driver.findElement(By.cssSelector("button#windowButton"));
        WebElement newWindowMsgBtn = driver.findElement(By.cssSelector("button#messageWindowButton"));
        newTabBtn.click();

        newWindowBtn.click();

        newWindowMsgBtn.click();


        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();
        while(it.hasNext()) { //start iterating through the handles
            String handle = it.next(); // get the next handle
            if(!mainPageHandle.equals(handle)) { // set a condition
                driver.switchTo().window(handle); // switch to a window which is not equal to main page handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.quit();
            }
        }
            }

        }


