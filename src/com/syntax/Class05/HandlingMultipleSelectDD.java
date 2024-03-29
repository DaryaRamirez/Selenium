package com.syntax.Class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static  String url="https://www.syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        WebElement statesDD=driver.findElement(By.name("States"));//using element it is a single dropdown to identify
        Select select=new Select(statesDD);
        boolean isMultiple =  select.isMultiple();
        System.out.println(isMultiple);
        if(isMultiple){
            List<WebElement> options= select.getOptions();
            for(WebElement option:options){
                String optionText=option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(2000);
            }

}
        //select.selectByIndex(5);
        select.deselectAll();
    }
}
