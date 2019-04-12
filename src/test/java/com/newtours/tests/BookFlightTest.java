package com.newtours.tests;

import com.newtours.pages.RegistrationPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTest;

public class BookFlightTest extends BaseTest {


    @BeforeTest
    /*public void setupDriver() {
        // set path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mixy\\Desktop\\chromedriver\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }*/

    @Test
    public void RegistrationPageTest() {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.goTo();
        registrationPage.enterUserDetails("selenium", "docker");
        registrationPage.enterUserCredentials("selenium", "docker");
        registrationPage.submit();
    }


}
