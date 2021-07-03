package com.VIP.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject {
    WebDriver driver;

    By userName = By.id("ap_email");
    By continueButton = By.xpath("//input[@id='continue']");
    By password = By.id("ap_password");
    By signInButton = By.xpath("//input[@id='signInSubmit']");

   public LoginPageObject (WebDriver driver){
       this.driver = driver;
   }

   public void loginApp(String u, String p) {
       driver.findElement(userName).sendKeys(u);
       driver.findElement(continueButton).click();
       driver.findElement(password).sendKeys(p);
       driver.findElement(signInButton).click();
   }

}
