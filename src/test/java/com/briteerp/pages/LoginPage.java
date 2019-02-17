package com.briteerp.pages;


import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement logInButton;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signInButton;


    public void positiveLogIn() {
        emailBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();
    }


}
