package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW2 {
    public static String url="http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        String mainPageHandle= driver.getWindowHandle();
        WebElement link= driver.findElement(By.linkText("This is a Ajax link"));
        link.click();
        Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();
        mainPageHandle=it.next();
        String childHandle=it.next();
        driver.switchTo().window(childHandle);
        WebElement text= driver.findElement(By.id("Result"));
        System.out.println(text.getText());
    }
}
