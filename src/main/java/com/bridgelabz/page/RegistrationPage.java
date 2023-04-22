package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
    //https://www.facebook.com/r.php
    @FindBy(name = "firstname")
    private WebElement firstname;
    @FindBy(name = "lastname")
    private WebElement lastname;
    @FindBy(name = "reg_email__")
    private WebElement phonenum;
    @FindBy(name = "reg_passwd__")
    private WebElement password;
    @FindBy(xpath = "//select[@id='day']")
    private WebElement date;
    @FindBy(xpath = "//select[@id='month']")
    private WebElement month;
    @FindBy(xpath = "//select[@id='year']")
    private WebElement year;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    private WebElement gender;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage registrtion(String uname, String lname,String phone,String pwd,String day,String months,String years ) {
        firstname.sendKeys(uname);
        lastname.sendKeys(lname);
        phonenum.sendKeys(phone);
        password.sendKeys(pwd);
        date.sendKeys(day);
        month.sendKeys(months);
        year.sendKeys(years);
        gender.click();

        return new HomePage();
    }

    public String verifyRegistrationPageTitle(){
        return driver.getTitle();
    }

}
