package com.testingacademy.pages.pageObjectVWO;

import com.testingacademy.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterDetails extends CommonToAllPage {
    WebDriver driver;
    public EnterDetails(WebDriver driver) {
        this.driver = driver;
    }

        By fname = By.name("first_name");
        By lname = By.name("last_name");
        By phone = By.name("phone");
        By password = By.name("password");
        By check = By.xpath("//input[@value='Website']");
        By createAccount= By.xpath("//button[text()='Create Account']");


    public void submitfirstName() {
        driver.findElement(fname).sendKeys("Jay");
    }
    public void submillastName(){
        driver.findElement(lname).sendKeys("Shankar");
    }
    public void submitPhoneNo(){
        driver.findElement(phone).sendKeys("7827299332");
    }
    public void submitpassword(){
        driver.findElement(password).sendKeys("P@ssword");
    }
    public void checkWebsite(){
        driver.findElement(check).click();

    }
    public void createAccountsubmit(){
        driver.findElement(createAccount).click();
    }
}
