package com.syntax.Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leave= driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leave.click();
        WebElement leaveList= driver.findElement(By.id("menu_leave_viewLeaveList"));
        leaveList.click();

        WebElement fromCalendar= driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement monthDD= driver.findElement(By.className("ui-datepicker-month"));
        Select select=new Select(monthDD);
        select.selectByVisibleText("Oct");
        List<WebElement> fromDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
for(WebElement fromDate:fromDates){
    String dateText=fromDate.getText();
    if(dateText.equals("10")){
        fromDate.click();
        break;
    }
}
 WebElement toCalendar= driver.findElement(By.id("calToDate"));
toCalendar.click();
 WebElement monthDD2= driver.findElement(By.className("ui-datepicker-month"));
 Select select2=new Select(monthDD2);
 select2.selectByVisibleText("Nov");
 List<WebElement> toDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
 for(WebElement toDate:toDates){
     String dateText2=toDate.getText();
     if(dateText2.equals("15")){
         toDate.click();
         break;
     }
 }
WebElement rejected= driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
 rejected.click();
WebElement cancelled= driver.findElement(By.id("leaveList_chkSearchFilter_0"));
cancelled.click();

WebElement app= driver.findElement(By.id("leaveList_chkSearchFilter_1"));
app.click();

WebElement unitDD= driver.findElement(By.id("leaveList_cmbSubunit"));
Select select3=new Select(unitDD);
select3.selectByVisibleText("IT Support");

WebElement searchBtn= driver.findElement(By.id("btnSearch"));
searchBtn.click();

driver.quit();
    }
}