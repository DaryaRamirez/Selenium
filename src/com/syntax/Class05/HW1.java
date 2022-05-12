package com.syntax.Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    public static String url="https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement newAccountButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccountButton.click();
Thread.sleep(2000);
        WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        FirstName.sendKeys("Darya");
        WebElement LastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        LastName.sendKeys("Ramirez");
        WebElement phone = driver.findElement(By.name("reg_email__"));
        phone.sendKeys("353-987-7764");
        WebElement password= driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("12345");

      WebElement monthsDD= driver.findElement(By.name("birthday_month"));
        Select selectMonths=new Select(monthsDD);
        selectMonths.selectByVisibleText("May");
        List<WebElement> allMonths=selectMonths.getOptions();
        int size3= allMonths.size();
        if(size3==12){
            System.out.println("Month dd has 12 month options");
        }else{
            System.out.println("Month dd doesn't have 12 month options. It has "+size3+ "options");
        }



WebElement daysDD= driver.findElement(By.name("birthday_day"));
Select select1=new Select(daysDD);
select1.selectByValue("21");
List<WebElement> allDays=select1.getOptions();
int size1= allDays.size();
        if(size1==31){
            System.out.println("Month dd has 31 month options");
        }else{
            System.out.println("Month dd doesn't have 31 day options. It has "+size1+ "options");
        }

        WebElement yearsDD= driver.findElement(By.name("birthday_year"));
        Select select2=new Select(yearsDD);
        select2.selectByValue("1987");
        List<WebElement> allYears=select2.getOptions();
        int size2=allYears.size();
        if(size2==115){
            System.out.println("Month dd has 12 month options");
        }else{
            System.out.println("Month dd doesn't have 115 year options. It has "+size2+ " options");
        }

        Thread.sleep(2000);
        driver.quit();







    }
}
