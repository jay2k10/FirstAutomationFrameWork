package com.testingacademy.tests.HDOR;

import com.testingacademy.base.CommonToAllTest;
import com.testingacademy.driver.DriverManager;
import com.testingacademy.pages.HDOR.DashboardPage;
import com.testingacademy.pages.HDOR.LoginPage;
import com.testingacademy.pages.HDOR.Reports;
import com.testingacademy.utils.PropertyReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.testingacademy.driver.DriverManager.driver;

public class LoginTest extends CommonToAllTest {
    @Test
    public void positiveLogin() throws IOException, InterruptedException {
        LoginPage lp = new LoginPage(DriverManager.getDriver());
        driver.get(PropertyReader.readKey("HDOR_URL"));
        lp.enterEmail();
        lp.clickContinue();
        lp.password();
        lp.clickLogin();
        Thread.sleep(10000);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/src/test/java/com/testingacademy/takeScreenshot/HDOR.png"));

        WebElement myevent = driver.findElement(By.xpath("//h6[text()='My Events']"));
        String str = myevent.getText();
        System.out.println(str);
        Assert.assertEquals(str, "My Events");

        DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver());
        dashboardPage.setClickOnTDH();
        //Thread.sleep(5000);
        dashboardPage.scrollScreen();
        WebElement finisherLevel = driver.findElement(By.xpath("//h6[text()='Finisher Level']"));
        String finisherLevelText = finisherLevel.getText();
        System.out.println(finisherLevelText);
        Assert.assertEquals(finisherLevelText, "Finisher Level");


        Reports reports = new Reports(DriverManager.getDriver());
        reports.clickOnReports();


    }
}
