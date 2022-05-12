package com.syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    public static String url="https://www.aa.com/homePage.do";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);

        WebElement calendar= driver.findElement(By.className("ui-datepicker-trigger"));
        calendar.click();

        WebElement nextBtn= driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        WebElement dMonth= driver.findElement(By.className("ui-datepicker-month"));
        String dMonthText=dMonth.getText();

        while(!dMonthText.equals("November")){
            nextBtn.click();
            dMonthText=dMonth.getText();
        }
        List<WebElement> dDay=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement departDate:dDay){
            if(departDate.getText().equals("7")){
                departDate.click();
                break;
            }
        }
WebElement rMonth= driver.findElement(By.className("ui-datepicker-month"));
        String rMonthText=rMonth.getText();
        while (!rMonthText.equals("December")){
            nextBtn.click();
            rMonthText=rMonth.getText();
        }
        List<WebElement> rDates=driver.findElements(By.xpath("\"//table[@class='ui-datepicker-calendar']/tbody/tr/td\""));
        for (WebElement rDate:rDates){
            if(rDate.getText().equals("11")){
                rDate.click();
                break;
            }
        }
WebElement to= driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
        to.sendKeys("Miami");

        WebElement search= driver.findElement(By.id("flightSearchForm.button.vacationSubmit"));
        search.click();

        driver.quit();
    }
}
