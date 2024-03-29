package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("8109555221", "Test12345");
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Facebook");
    }

    @Test
    public void gotoProfileTest() {
        profilePage = homePage.gotoProfile();
    }

    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
