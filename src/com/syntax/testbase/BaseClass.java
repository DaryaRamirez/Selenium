package com.syntax.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    /*
    method to open a browser
    method to close browser
     */
   public static WebDriver driver;

    /**
     *
     * @param url
     */
    public static void openWithSpecificUrl(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }
}
