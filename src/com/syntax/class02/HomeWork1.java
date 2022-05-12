package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser

 */
public class HomeWork1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("1725 Curson st");
        driver.findElement(By.name("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.name("customer.address.state")).sendKeys("California");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("90047");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("323-127-5572");
        driver.findElement(By.id("customer.ssn")).sendKeys("023-76-9679");
        driver.findElement(By.name("customer.username")).sendKeys("JSmith");
        driver.findElement(By.name("customer.password")).sendKeys("12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
        driver.findElement(By.linkText("Register")).click();
        driver.quit();
    }
}

