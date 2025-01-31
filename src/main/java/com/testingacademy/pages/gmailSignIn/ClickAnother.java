package com.testingacademy.pages.gmailSignIn;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickAnother extends CommonToAllPage {
    WebDriver driver;

    public ClickAnother(WebDriver driver){
        this.driver= driver;
    }
    By  clickAnotherAccount = By.xpath("//input[@id='identifierId']");


    public void clickAnotherLink(){
        driver.findElement(clickAnotherAccount).sendKeys("jayshankarprasad57@gmail.com");
    }
}
