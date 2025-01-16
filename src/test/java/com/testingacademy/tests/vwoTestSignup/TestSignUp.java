package com.testingacademy.tests.vwoTestSignup;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.pageObjectVWO.ClickFreeAcount;
import com.testingacademy.pages.pageObjectVWO.EnterDetails;
import com.testingacademy.pages.pageObjectVWO.EnterEmail;
import com.testingacademy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.testingacademy.driver.DriverManager.driver;

public class TestSignUp extends CommonToAllTest {

    @Test
    public void clickOnFreeTrialAccount(){
        ClickFreeAcount f = new ClickFreeAcount(DriverManager.getDriver());
        driver.get(PropertyReader.readKey("VWO_Login"));
        f.onClick();
        EnterEmail e = new EnterEmail(DriverManager.getDriver());
        e.email();
        e.clickOnCheckbox();
        e.freesignupButton();

        EnterDetails d = new EnterDetails(DriverManager.getDriver());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.name("first_name")));
        d.submitfirstName();
        d.submillastName();
        d.submitPhoneNo();
        d.submitpassword();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Website']")));
        d.checkWebsite();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        d.createAccountsubmit();

    }
}
