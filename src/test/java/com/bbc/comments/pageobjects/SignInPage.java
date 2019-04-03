package com.bbc.comments.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage extends BasePage {


    public SignInPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how = How.ID, using = "user-identifier-input")
    private WebElement userName;

    @FindBy(how = How.ID, using = "password-input")
    private WebElement password;

    @FindBy(how = How.ID, using = "submit-button")
    private  WebElement signInButton;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void signIn(String username,String password) {

        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
        getSignInButton().click();

    }
}


