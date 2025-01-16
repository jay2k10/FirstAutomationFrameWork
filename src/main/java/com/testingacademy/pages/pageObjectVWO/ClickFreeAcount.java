package com.testingacademy.pages.pageObjectVWO;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickFreeAcount extends CommonToAllPage {
    WebDriver driver;

    public ClickFreeAcount(WebDriver driver) {
        this.driver = driver;
    }

    By clickOnFreeTrail = By.xpath("//a[@class='text-link']");

    public void onClick(){
        driver.findElement(clickOnFreeTrail).click();
    }
}
