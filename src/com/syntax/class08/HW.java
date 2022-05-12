package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
    //go to https://the-internet.herokuapp.com/dynamic_controls
    // click on checkbox and click on remove
    // verify the text
    // click on enable verify the textbox is enabled
    // enter text and click disable
    // verify the textbox is disabled

    public static String url="https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement checkBox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeBtn= driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
        removeBtn.click();

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        WebElement text= driver.findElement(By.id("message"));
        System.out.println(text.getText());

        WebElement enableBtn= driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
        enableBtn.click();
         WebDriverWait wait1=new WebDriverWait(driver,20);
         wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"It's enabled!\")]")));
         WebElement text1= driver.findElement(By.xpath("//p[contains(text(),\"It's enabled!\")]"));
        System.out.println(text1.getText());

        WebElement entText= driver.findElement(By.xpath("//input[@type='text']"));
        entText.sendKeys("Hello");

        WebElement disableBtn= driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
        disableBtn.click();
        WebDriverWait wait2=new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"It's disabled!\")]")));
        WebElement text2= driver.findElement(By.xpath("//p[contains(text(),\"It's disabled!\")]"));
        System.out.println(text2.getText());


    }



}
