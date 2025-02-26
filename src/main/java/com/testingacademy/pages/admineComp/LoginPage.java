package com.testingacademy.pages.admineComp;

import com.testingacademy.base.CommonToAllPage;
import com.testingacademy.utils.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Collections;

public class LoginPage extends CommonToAllPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }



        //locators
        By userName = By.name("j_username");
        By password = By.name("j_password");

   // Xls_Reader reader = new Xls_Reader(System.getProperty("user.dir") +"/src/test/java/com/testingacademy/testData/ecompLoginData.xlsx");
   // String sheetName = "ecompLoginData";
//
   //int rowCount = reader.getRowCount(sheetName);
//
//
//    for(int rowNum=2; rowNum<=rowCount; rowNum++){
//
//    }

        public void sendUser(){
            driver.findElement(userName).sendKeys("admin");
        }
        public void password(){
            driver.findElement(password).sendKeys("password");
        }






}

