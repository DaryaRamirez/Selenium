package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDWithIterator {
    public static  String url="https://amazon.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement statesDD=driver.findElement(By.id("searchDropdownBox"));//using element it is a single dropdown to identify
        Select select=new Select(statesDD);
        boolean isMultiple =  select.isMultiple();
        System.out.println(isMultiple);
        if(!isMultiple) {
           List<WebElement> options = select.getOptions();
            Iterator<WebElement> it=options.iterator();
            while (it.hasNext()){
                WebElement ddOption = it.next();
                String optionText=ddOption.getText();
                System.out.println(optionText);
            }

        }
        }
}
