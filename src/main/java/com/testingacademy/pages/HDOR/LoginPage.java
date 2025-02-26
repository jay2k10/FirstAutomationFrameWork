package com.testingacademy.pages.HDOR;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends CommonToAllPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Locators
    By username = By.xpath("//input[@name='email']");
    By continueClick = By.xpath("(//div[@class='MuiGrid-root MuiGrid-container css-1i4kwc7'])[1]");
    By password = By.xpath("//input[@name='password']");
    By login = By.xpath("(//div[@class='MuiGrid-root MuiGrid-container css-1i4kwc7'])[1]");


    //Page Actions

    public void enterEmail() {
        driver.findElement(username).sendKeys(PropertyReader.readKey("HDOR_user"));
    }

    public void clickContinue() {
        driver.findElement(continueClick).click();
        //driver.navigate().back();

    }

    public void password() {
        presenceOfElement(password);
        driver.findElement(password).sendKeys(PropertyReader.readKey("Hdor_pass"));

    }

    public void clickLogin() {
        presenceOfElement(login);
        driver.findElement(login).click();
    }




}
