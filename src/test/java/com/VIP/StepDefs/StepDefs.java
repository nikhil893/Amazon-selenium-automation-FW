package com.VIP.StepDefs;

import com.VIP.pageObjects.LoginPageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefs {
    String url = "https://amazon.in";
    WebDriver driver;
    int Timeouts=20;
    Scenario Scenario;
    LoginPageObject LoginPageObject;
    String baseUrl = "https://www.amazon.in";


    @Before
    public void openingBrowser(Scenario scenario) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Timeouts,TimeUnit.SECONDS);
        LoginPageObject = new LoginPageObject(driver);
        Scenario.log("chrome drivers is invoked");

    }
    @After
    public void closeBrowser() {
        driver.quit();


    }

    @Given(": user is on login page")
    public void user_is_on_login_page() {
        driver.get(baseUrl + "/ap/signin");
        Scenario.log("Navigation to login page is successfully");

    }
    @Then(": user is enter username as {string} and password as {string}")
    public void user_is_enter_username_as_and_password_as(String u, String p) {
        LoginPageObject.loginApp(u,p);
        Scenario.log("login using username:" + u + "password: + p");

    }
    @When(": user is able to access this URL")
    public void user_is_able_to_access_this_url() {
        //String expected = driver.getTitle();
        //String act = "content";
        Assert.assertEquals(driver.getTitle(),"content" );

    }

}
