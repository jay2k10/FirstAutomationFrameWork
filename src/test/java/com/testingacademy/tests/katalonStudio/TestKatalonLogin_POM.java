package com.testingacademy.tests.katalonStudio;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.pageObjectModel.Katalon_Login;
import com.testingacademy.pages.pageObjectModel.LoginPage_POM;
import com.testingacademy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testingacademy.driver.DriverManager.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class TestKatalonLogin_POM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestKatalonLogin_POM.class);


    @Test
    public void testLoginPage() {

        Katalon_Login login= new Katalon_Login(DriverManager.getDriver());
        driver.get(PropertyReader.readKey("Katalon_url"));
        login.userID();
        login.pass();
        login.click();


    }

}
