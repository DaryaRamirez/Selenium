package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
 */
public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement login= driver.findElement(By.xpath("//input[contains(@id,\"btnLogin\")]"));
        login.click();
        WebElement message= driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(message.isDisplayed());
        driver.quit();

    }
}
