package com.bbc.comments.steps;

import com.bbc.comments.pageobjects.ArticalPage;
import com.bbc.comments.pageobjects.Homepage;
import com.bbc.comments.pageobjects.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

    public static WebDriver driver;
    public Homepage homePage;
    public SignInPage signinPage;
    public ArticalPage articalPage;

    public CommonSteps()
    {
        WebDriverManager.chromedriver().setup();
        if(driver==null) {
            driver = new ChromeDriver();
        }
        homePage=new Homepage(driver);
        signinPage=new SignInPage(driver);
        articalPage=new ArticalPage(driver);
    }
}
