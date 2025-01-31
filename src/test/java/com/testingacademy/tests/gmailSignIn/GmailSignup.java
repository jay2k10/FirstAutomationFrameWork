package com.testingacademy.tests.gmailSignIn;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.gmailSignIn.ClickAnother;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.testng.annotations.Test;

import java.util.Collections;

import static com.testingacademy.driver.DriverManager.driver;

public class GmailSignup extends CommonToAllTest {

    @Test
    public void Sign() {
        //WebDriver driver = new EdgeDriver(DriverManager.getDriver());
        //driver.manage().window().maximize();
        ClickAnother another = new ClickAnother(DriverManager.getDriver());
        driver.get("https://accounts.google.com/");

        another.clickAnotherLink();

    }

}
