package com.testingacademy.tests.admineComp;

import com.testingacademy.utils.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest1 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://e-compliance.in/Admin/login.htm");

        WebElement userName = driver.findElement(By.name("j_username"));
        WebElement pwd = driver.findElement(By.name("j_password"));


        Xls_Reader reader = new Xls_Reader("C:\\Users\\Naman\\IdeaProjects\\FirstAutomationFrameWork\\src\\test\\java\\com\\testingacademy\\testData\\ecompLoginData.xlsx");
        String sheetName = "loginData";

        int rowCount = reader.getRowCount(sheetName);
        for(int rowNum=1; rowNum<=rowCount; rowNum++){
            String loginId = reader.getCellData(sheetName, "username", rowNum);
            String passsword = reader.getCellData(sheetName, "password", rowNum);

            System.out.println(loginId + " " + passsword);

            userName.clear();
            userName.sendKeys(loginId);

            pwd.clear();
            pwd.sendKeys(passsword);


        }
    }
}
