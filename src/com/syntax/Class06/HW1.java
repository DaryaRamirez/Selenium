package com.syntax.Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static String url="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame("FrameOne");
        WebElement header= driver.findElement(By.xpath("//h1[@class='heading-13']"));
        String text= header.getText();
        System.out.println(text);
        if(header.getText().equals("Sorry, We Couldn't Find Anything For “Asksn”")){
            System.out.println("Header text verified");
        }else{
            System.out.println("Text is not verified");}
            driver.switchTo().defaultContent();
            driver.switchTo().frame("FrameTwo");
            WebElement enrollButton= driver.findElement(By.xpath("(//a[@class='primary-button w-inline-block'])[1]"));
            boolean enabled= enrollButton.isEnabled();
            if(enabled){
                System.out.println("Button enabled");
            }else {
                System.out.println("Button disabled");
            }
            driver.switchTo().defaultContent();
driver.quit();

    }
}
