package com.testingacademy.pages.pageObjectVWO;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterEmail extends CommonToAllPage {
    WebDriver driver;

    public EnterEmail(WebDriver driver) {
        this.driver = driver;
    }

    By busines_Email = By.name("email");
    By checkbox = By.name("gdpr_consent_checkbox");
    By ClickOnFreeAccount = By.xpath("//button[@data-qa='page-su-submit']");

    public void email(){
        driver.findElement(busines_Email).sendKeys("jayshankarprasad57@gmail.com");
    }
    public void clickOnCheckbox(){
        driver.findElement(checkbox).click();

    }
    public void freesignupButton(){
        driver.findElement(ClickOnFreeAccount).click();
    }


}
