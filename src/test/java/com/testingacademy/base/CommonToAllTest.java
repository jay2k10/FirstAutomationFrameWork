package com.testingacademy.base;

import com.testingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {

    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }

    // Who will close the Webdriver
    @AfterMethod
    public void tearDown(){
        DriverManager.down();
    }


}
