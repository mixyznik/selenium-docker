package com.pencil.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PencilTest extends BaseTest {


    @Test(dataProvider = "logData")
    public void logTesting(String usernameData, String emailData, String passwordData) {
        System.out.println("Starting logIn test");

        sleep(3000);

        driver.manage().window().maximize();

        // open the page
        String url = "http://pencil.mqsoft.rs/login";
        driver.get(url);
        sleep(3000);
        System.out.println("Page is opened");

        // register user
        //*[@id="root"]/div[2]/div/div/div/div/button[2]

        // enter username
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys(emailData);
        sleep(500);

        // enter password
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys(passwordData);
        sleep(500);

        // push sign in button
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/form/button"));
        signInButton.click();
        sleep(2000);

        // verifications of new url

        String expectedUrl = "http://pencil.mqsoft.rs/projects";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


        sleep(3000);
        //driver.quit();

    }

    /**
     * Static sleep
     */
    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
