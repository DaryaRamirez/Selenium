package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW3 {
    public static String url="https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement categoryDD= driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select= new Select(categoryDD);
        List<WebElement> options=select.getOptions();
        for (WebElement option:options
             ) {
            String optionText=option.getText();
            System.out.println(optionText);
        }
        Thread.sleep(2000);
        select.selectByValue("58058");
         WebElement search= driver.findElement(By.cssSelector("input#gh-btn"));
         search.click();
         Thread.sleep(1000);

        String title=  driver.getTitle();
        System.out.println(title);

         if(driver.getTitle().equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
             System.out.println("Header is verified");
         }else{
             System.out.println("Header is not verified");
         }
         Thread.sleep(1000);
         driver.quit();


    }
}
