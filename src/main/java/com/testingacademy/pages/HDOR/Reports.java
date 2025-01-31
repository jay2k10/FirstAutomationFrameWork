package com.testingacademy.pages.HDOR;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reports extends CommonToAllPage {
    WebDriver driver;
    public Reports(WebDriver driver) {
        this.driver=driver;
    }

        //Page Locators
        By reportsTDH = By.xpath("//button[text()='Reports']");

       //Page Actions

        public void clickOnReports(){
            driver.findElement(reportsTDH).click();

        }
}
