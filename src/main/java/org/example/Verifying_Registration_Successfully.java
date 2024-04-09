package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;

public class Verifying_Registration_Successfully {
    protected static WebDriver Driver;
    static String Expected = "Your registration completed";

    public static void main(String[] args) {
        //Open the Driver
          Driver = new ChromeDriver();
          Driver.manage().window().maximize();
           //Open the URL
          Driver.get("https://demo.nopcommerce.com/");
          // click on Register buttpn
          Driver.findElement(By.linkText("Register")).click();
           //Enter the first name
          Driver.findElement(By.id("FirstName")).sendKeys("Janvi");
          //enter the Last Name
          Driver.findElement(By.id("LastName")).sendKeys("Parikha");
        //Enter the email ID
          Driver.findElement(By.id("Email")).sendKeys("Janv14i@gmail.com");
          //Enter the company name
          Driver.findElement(By.name("Company")).sendKeys("E-commarce");
          //Enter Password
          Driver.findElement(By.name("Password")).sendKeys("Janvi@1993");
        //Enter ConfirmPassword
        Driver.findElement(By.name("ConfirmPassword")).sendKeys("Janvi@1993");
        //Click on Register button
        Driver.findElement(By.name("register-button")).click();
        //store dispaly message in variable
        String Actual = Driver.findElement(By.className("result")).getText();

//comparing the expected and actual value
       if(Actual.equals(Expected))
       {
            System.out.println("This Testcase is pass");
       }else
       {System.out.println("This Testcase is Fail");}
       //Close the browser
       Driver.quit();
    }

}
