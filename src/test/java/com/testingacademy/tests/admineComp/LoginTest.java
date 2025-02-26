package com.testingacademy.tests.admineComp;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.admineComp.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static com.testingacademy.driver.DriverManager.driver;

public class LoginTest extends CommonToAllTest {

   @Test
    public void loginPositiveTest(){
       LoginPage loginPage= new LoginPage(DriverManager.getDriver());
       driver.get("https://e-compliance.in/Admin/login.htm");
       loginPage.sendUser();
       loginPage.password();
   }
}
