package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseClass {
    RegistrationPage registrationPage;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        registrationPage = new RegistrationPage();
    }

    @Test
    public void verifyRegistrationPageTitleTest() {
       String registrationPageTitle = registrationPage.verifyRegistrationPageTitle();
        Assert.assertEquals(registrationPageTitle, "Sign up for Facebook | Facebook");
    }

    @DataProvider
    public Object[][] getRegistrationTestData() {
        return Utility.getTestData("registration");
    }

    @Test(dataProvider = "getRegistrationTestData")
    public void registrationTest(String firstname, String lastname,String phonenum,String password, String date,String month,String year) {
        homePage = registrationPage.registrtion(firstname, lastname, phonenum, password, date, month, year);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
