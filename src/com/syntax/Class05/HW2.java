package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static String url="https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement newAccountButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccountButton.click();
        Thread.sleep(2000);
        WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstName.sendKeys("Dar");
        WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        LastName.sendKeys("Rez");
        WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("353-987-7764");
        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("12345");

        WebElement monthsDD= driver.findElement(By.name("birthday_month"));
        Select selectMonths=new Select(monthsDD);
        selectMonths.selectByVisibleText("May");

        WebElement daysDD= driver.findElement(By.name("birthday_day"));
        Select select1=new Select(daysDD);
        select1.selectByValue("20");

        WebElement yearsDD= driver.findElement(By.name("birthday_year"));
        Select select2=new Select(yearsDD);
        select2.selectByValue("1989");

Thread.sleep(2000);
       List<WebElement> radioButtons= driver.findElements(By.cssSelector("label[class = '_58mt']"));
        for (WebElement radioButton:radioButtons){
            String radioButtonText=radioButton.getText();
            if(radioButtonText.equals("Female")){
                radioButton.click();
                break;
            }

        }

     WebElement SignUp= driver.findElement(By.name("websubmit"));
        SignUp.click();
        Thread.sleep(1000);
        driver.quit();

    }
}
