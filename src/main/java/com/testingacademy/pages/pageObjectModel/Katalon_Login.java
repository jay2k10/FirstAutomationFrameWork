package com.testingacademy.pages.pageObjectModel;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Katalon_Login extends CommonToAllPage {

    WebDriver driver;

    public Katalon_Login(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.id("txt-username");
    By password = By.id("txt-password");
    By login = By.id("btn-login");


    public void userID(){
        driver.findElement(userName).sendKeys(PropertyReader.readKey("Katalon_username"));

    }
    public void pass(){
        driver.findElement(password).sendKeys(PropertyReader.readKey("Katalon_password"));

    }
    public void click(){
        driver.findElement(login).click();

    }
}
